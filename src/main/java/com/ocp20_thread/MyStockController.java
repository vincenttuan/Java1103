package com.ocp20_thread;

import java.util.Date;
import java.util.concurrent.FutureTask;
import javax.swing.JLabel;
import yahoofinance.Stock;

public class MyStockController implements Runnable {
    private String symbol;
    private JLabel priceLabel;
    private JLabel changeLabel;
    public boolean play;

    public MyStockController(String symbol, JLabel priceLabel, JLabel changeLabel) {
        this.symbol = symbol;
        this.priceLabel = priceLabel;
        this.changeLabel = changeLabel;
        play = true;
    }
    
    @Override
    public void run() {
        while (play) {            
            try {
                System.out.println(new Date());
                FutureTask<Stock> task = new FutureTask<>(new MyStock(symbol));
                new Thread(task).start(); // 放到執行緒去執行,重要 !!
                Stock stock = task.get();
                double price = stock.getQuote().getPrice().doubleValue();
                double change = stock.getQuote().getChange().doubleValue();
                priceLabel.setText(String.format("%.2f", price));
                changeLabel.setText(String.format("%.2f", change));
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
    
}
