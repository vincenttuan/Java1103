package com.ocp25_threadpool;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(100);
    }
    
}
