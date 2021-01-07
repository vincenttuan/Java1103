package com.ocp13_collection_set;

import com.github.javafaker.Faker;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            names.add(faker.name().lastName());
        }
        System.out.println(names);
    }
}
