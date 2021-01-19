package com.ocp20_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

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
    public static void main(String[] args) throws Exception {
        Runner runner = new Runner();
        Caller caller = new Caller();
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(runner);
        Future f2 = es.submit(caller);
        Object s1 = f1.get();
        Object s2 = f2.get();
        System.out.println(s1);
        System.out.println(s2);
        es.shutdown();
    }
}
