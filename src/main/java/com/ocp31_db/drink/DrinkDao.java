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
}
