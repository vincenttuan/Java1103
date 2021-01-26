package com.ocp28_lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LottoMain {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Lotto("Vincent"));
        service.execute(new Lotto("Anita"));
        service.shutdown();
    }
}
