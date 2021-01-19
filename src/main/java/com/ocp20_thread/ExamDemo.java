package com.ocp20_thread;

import java.util.concurrent.Callable;

class Runner implements Runnable {
    @Override
    public void run() {
        System.out.println("Print run in run()");
    }
}

class Caller implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Print call in call()");
        return "call";
    }
}

public class ExamDemo {
    
}
