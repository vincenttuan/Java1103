package com.ocp20_thread;

import java.util.concurrent.Callable;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class MyStock implements Callable<Stock>{
    private String symbol;

    public MyStock(String symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public Stock call() throws Exception {
        Stock stock = YahooFinance.get(symbol);
        return stock;
    }
    
}
