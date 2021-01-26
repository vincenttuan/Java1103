package com.ocp27_invoke;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Random r = new Random();
        Thread.sleep(r.nextInt(10_000));
        int n = r.nextInt(10) + 1;
        String name = Thread.currentThread().getName();
        System.out.printf("%s 完成工作了, n= %d\n", name, n);
        return n;
    }
    
}
