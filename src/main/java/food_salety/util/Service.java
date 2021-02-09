package food_salety.util;

import com.google.gson.Gson;
import food_salety.entity.Rice;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private static Connection conn;
    static {
        try {
            String url = "jdbc:derby://localhost:1527/demo";
            String user = "app";
            String password = "app";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // 取得 json 資料
    public String getJsonString(String url) {
        String json = "";
        try(InputStream is = new URL(url).openStream();
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr)) {
            String data = "";
            while( (data = br.readLine()) != null) {
                json += data;
            }
        } catch (Exception e) {
        }
        return json;
    }
    
    // 取得 Rice[] 資料
    public Rice[] queryRices(String url) {
        String json = getJsonString(url);
        // json 轉 List<Rice>, 使用 Gson
        Gson gson = new Gson();
        Rice[] rices = gson.fromJson(json, Rice[].class);
        return rices;
    }
    
    // 將資料匯入到 Rice 資料表內
    public void importToRiceTable(String url) {
        Rice[] rices = queryRices(url);
        String sql = "Insert Into Rice(Title, 編號, 品名, 國際條碼, 廠商名稱, 廠商地址, 檢驗結果, 不合格原因, 違反規定, 行政處分, Log_UpdateTime) " +
                     " Values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.clearBatch(); // 清空緩存
            for(Rice r : rices) {
                pstmt.setString(1, r.getTitle());
                pstmt.setString(2, r.get編號());
                pstmt.setString(3, r.get品名());
                pstmt.setString(4, r.get國際條碼());
                pstmt.setString(5, r.get廠商名稱());
                pstmt.setString(6, r.get廠商地址());
                pstmt.setString(7, r.get檢驗結果());
                pstmt.setString(8, r.get不合格原因());
                pstmt.setString(9, r.get違反規定());
                pstmt.setString(10, r.get行政處分());
                pstmt.setString(11, r.getLog_UpdateTime());
                pstmt.addBatch(); // 加入緩存
            }
            pstmt.executeBatch(); // 執行緩存
            System.out.println("匯入成功~");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // 將 Rice 資料表清空
    public void clearRiceTable() {
        String sql = "Delete From Rice";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            System.out.println("Clear Rice OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // 取得 Rice Table 的所有資料
    public List<Rice> queryRicesFromTable() {
        List<Rice> rices = new ArrayList<>();
        String sql = "Select id, Title, 編號, 品名, 國際條碼, 廠商名稱, 廠商地址, 檢驗結果, 不合格原因, 違反規定, 行政處分, Log_UpdateTime From Rice";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Rice r = new Rice();
                r.setId(rs.getInt("id"));
                r.setTitle(rs.getString("Title"));
                r.set編號(rs.getString("編號"));
                r.set品名(rs.getString("品名"));
                r.set國際條碼(rs.getString("國際條碼"));
                r.set廠商名稱(rs.getString("廠商名稱"));
                r.set廠商地址(rs.getString("廠商地址"));
                r.set檢驗結果(rs.getString("檢驗結果"));
                r.set不合格原因(rs.getString("不合格原因"));
                r.set違反規定(rs.getString("違反規定"));
                r.set行政處分(rs.getString("行政處分"));
                r.setLog_UpdateTime(rs.getString("Log_UpdateTime"));
                rices.add(r);
            }
            rs.close();
        } catch (Exception e) {
        }
        return rices;
    }
    
    // 利用關鍵字查詢 Rice Table 的資料
    public List<Rice> queryRicesFromTable(String keyword) {
        List<Rice> rices = new ArrayList<>();
        String sql = "Select id, Title, 編號, 品名, 國際條碼, 廠商名稱, 廠商地址, 檢驗結果, 不合格原因, 違反規定, 行政處分, Log_UpdateTime From Rice WHERE 品名 like ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + keyword + "%");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Rice r = new Rice();
                r.setId(rs.getInt("id"));
                r.setTitle(rs.getString("Title"));
                r.set編號(rs.getString("編號"));
                r.set品名(rs.getString("品名"));
                r.set國際條碼(rs.getString("國際條碼"));
                r.set廠商名稱(rs.getString("廠商名稱"));
                r.set廠商地址(rs.getString("廠商地址"));
                r.set檢驗結果(rs.getString("檢驗結果"));
                r.set不合格原因(rs.getString("不合格原因"));
                r.set違反規定(rs.getString("違反規定"));
                r.set行政處分(rs.getString("行政處分"));
                r.setLog_UpdateTime(rs.getString("Log_UpdateTime"));
                rices.add(r);
            }
            rs.close();
        } catch (Exception e) {
        }
        return rices;
    }
    
}
