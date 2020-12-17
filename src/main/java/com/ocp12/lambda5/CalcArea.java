package com.ocp12.lambda5;

import java.util.function.Function;

public class CalcArea {
    public static void main(String[] args) {
        Function<Integer, Double> func = (x) -> x * x * 3.14;
        System.out.println(func.apply(10));
    }
}
