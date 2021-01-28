package com.ocp31_db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) throws Exception {
        // 1. 載入JDBC驅動程式
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        // 2. 建立資料庫連線
        String url = "jdbc:derby://localhost:1527/demo"; // 資料庫的位置
        String user = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.printf("資料庫連線是否關閉: %b\n", conn.isClosed());
        // 3. 建立 Statement 敘述(用來敘述撰寫 SQL 語法)物件
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        // 4. 設定修改的 id 值
        int updateId = 5;
        // 5. 建立修改的查詢 (用 SQL 先查出你要修改的該筆紀錄)
        String sql = "SELECT d.ID, d.\"NAME\", d.PRICE, d.AMOUNT, d.TDATE FROM APP.DRINK d WHERE id = " + updateId;
        ResultSet rs = stmt.executeQuery(sql);
        // 6. 指標移動到該筆紀錄
        if(rs.last()) {
            // 7. 修改你的內容 (假設只要修改 price 與 amount)
            rs.updateInt("price", 17);
            rs.updateInt("amount", 50);
            // 8. 修改資料
            rs.updateRow();
            System.out.println("修改成功!");
        } else {
            System.out.println("沒有資料可以修改!");
        }
        // 9. 關閉資源
        rs.close();
        stmt.close();
        conn.close();
    }
}
