package com.ocp27_invoke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAnyDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我最先跑完的資料1~10的數字");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        int result = service.invokeAny(list);
        System.out.println("最先拿到的資料: " + result);
        service.shutdown();
    }
}
