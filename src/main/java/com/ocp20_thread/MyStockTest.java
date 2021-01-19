package com.ocp20_thread;

import java.util.concurrent.FutureTask;
import yahoofinance.Stock;

public class MyStockTest {
    public static void main(String[] args) throws Exception {
        // 設定商品代號
        //String symbol = "USDTWD=x"; // 匯率
        //String symbol = "2498.TW"; // 股票
        String symbol = "^TWII"; // 台灣加權指數
        // 建立 Callable 物件(如: MyStock)
        MyStock myStock = new MyStock(symbol);
        // 建立 FutureTask 來執行 Callable 物件
        FutureTask<Stock> task = new FutureTask<>(myStock);
        // 啟動執行緒去執行
        new Thread(task).start();
        // 接收結果
        Stock stock = task.get();
        // 印出價格
        double price = stock.getQuote().getPrice().doubleValue();
        double change = stock.getQuote().getChange().doubleValue();
        System.out.println(stock.getName());
        System.out.printf("%s ==> %.2f (%.2f)\n", symbol, price, change);
    }
}
