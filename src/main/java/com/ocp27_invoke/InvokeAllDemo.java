package com.ocp27_invoke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我5個1~10的數字");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        List<Future<Integer>> results = service.invokeAll(list);
        for (Future<Integer> future : results) {
            System.out.println(future.get());
        }
        service.shutdown();
    }
}
