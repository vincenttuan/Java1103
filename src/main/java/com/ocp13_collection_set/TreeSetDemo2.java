package com.ocp13_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set<Exam> exams = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            exams.add(new Exam());
        }
        System.out.println(exams);
    }
}
