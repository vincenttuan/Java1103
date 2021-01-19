package com.ocp20_thread;

import java.util.concurrent.FutureTask;
import javax.swing.JLabel;
import yahoofinance.Stock;

public class MyController implements Runnable {
    private String symbol;
    private JLabel priceLabel;
    private JLabel changeLabel;
    public static boolean play;

    public MyController(String symbol, JLabel priceLabel, JLabel changeLabel) {
        this.symbol = symbol;
        this.priceLabel = priceLabel;
        this.changeLabel = changeLabel;
        play = true;
    }
    
    @Override
    public void run() {
        while (play) {            
            try {
                FutureTask<Stock> task = new FutureTask<>(new MyStock(symbol));
                Stock stock = task.get();
                double price = stock.getQuote().getPrice().doubleValue();
                double change = stock.getQuote().getChange().doubleValue();
                priceLabel.setText(String.format("%.2f", price));
                changeLabel.setText(String.format("%.2f", change));
            } catch (Exception e) {
            }
        }
    }
    
}
