package com.ocp31_db.drink;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Date;

public class DrinkDao {

    private static Connection conn;

    static {
        try {
            // 1. 載入JDBC驅動程式(4.0可以不用寫)
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. 建立資料庫連線
            String url = "jdbc:derby://localhost:1527/demo"; // 資料庫的位置
            String user = "app";
            String password = "app";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
        }
    }

    public void read() {
        String sql = "SELECT d.ID, d.\"NAME\", d.PRICE, d.AMOUNT, d.TDATE FROM APP.DRINK d";
        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            System.out.printf("-----------------------------------------|\n");
            ResultSetMetaData md = rs.getMetaData();
            System.out.printf("|%-2s|%-10s|%-6s|%-6s|%-12s|\n",
                    md.getColumnName(1),
                    md.getColumnName(2),
                    md.getColumnName(3),
                    md.getColumnName(4),
                    md.getColumnName(5)
            );
            System.out.printf("-----------------------------------------|\n");
            // 走訪 ResultSet 資料集合
            int totalAmount = 0;
            int totalPrice = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                int amount = rs.getInt("amount");
                Date tdate = rs.getDate("tdate");
                totalAmount += amount;
                totalPrice += price * amount;
                System.out.printf("|%2d|%-10s|%6d|%6d|%12s|\n", id, name, price, amount, tdate);
            }
            System.out.printf("-----------------------------------------|\n");
            System.out.printf("|%20s|%,6d|%12s|\n", "Total amount:", totalAmount, "");
            System.out.printf("|%20s|%,6d|%12s|\n", "Total price:", totalPrice, "");

        } catch (Exception e) {
        }
    }

    public void create(String name, int price, int amount) {
        // 先取得 nextId
        String sql = "SELECT MAX(d.ID) as id FROM APP.DRINK d";
        int nextId = 0;
        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            rs.next(); // 游標移動到該筆紀錄
            nextId = rs.getInt("id") + 1; // 取得最大 id 值 + 1
        } catch (Exception e) {
        }
        // 新增程序
        sql = "SELECT d.ID, d.\"NAME\", d.PRICE, d.AMOUNT, d.TDATE FROM APP.DRINK d";
        try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql);) {
            // 指標移動到可新增的紀錄
            rs.moveToInsertRow();
            // 加入你要新增的內容
            rs.updateInt("id", nextId);
            rs.updateString("name", name);
            rs.updateInt("price", price);
            rs.updateInt("amount", amount);
            rs.updateDate("tdate", new java.sql.Date(new java.util.Date().getTime()));
            // 新增資料
            rs.insertRow();
            System.out.println("新增成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int id, int amount) {
        String sql = "SELECT d.ID, d.\"NAME\", d.PRICE, d.AMOUNT, d.TDATE FROM APP.DRINK d WHERE id = " + id;
        try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery(sql);) {
            // 指標移動到該筆紀錄
            if (rs.last()) {
                // 修改你的內容 (只要修改amount)
                rs.updateInt("amount", amount);
                // 8. 修改資料
                rs.updateRow();
                System.out.println("修改成功!");
            } else {
                System.out.println("沒有資料可以修改!");
            }
        } catch (Exception e) {
        }
    }

    public void delete(int id) {
        String sql = "SELECT d.ID, d.\"NAME\", d.PRICE, d.AMOUNT, d.TDATE FROM APP.DRINK d WHERE id = " + id;
        try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql);) {
            if (rs.last()) { // 指標移動到該筆紀錄
                // 刪除資料
                rs.deleteRow();
                System.out.println("刪除成功!");
            } else {
                System.out.println("沒有資料可以刪除!");
            }
        } catch (Exception e) {
            System.out.println("資料庫連線失敗");
            e.printStackTrace();
        }

    }
}
