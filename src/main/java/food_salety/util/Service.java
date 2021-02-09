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
        }
    }
}
