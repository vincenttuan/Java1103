package com.ocp31_db.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete {

    public static void main(String[] args) throws Exception {
        // 1. 載入JDBC驅動程式
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        // 2. 建立資料庫連線
        String url = "jdbc:derby://localhost:1527/demo"; // 資料庫的位置
        String user = "app";
        String password = "app";

        // 刪除 id 值
        int deleteId = 6;
        String sql = "SELECT d.ID, d.\"NAME\", d.PRICE, d.AMOUNT, d.TDATE FROM APP.DRINK d WHERE id = " + deleteId;
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
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
