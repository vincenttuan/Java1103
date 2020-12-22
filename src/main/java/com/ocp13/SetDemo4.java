package com.ocp13;

import java.util.LinkedHashSet;
import java.util.Set;
import static java.util.stream.Collectors.toSet;
import java.util.stream.IntStream;

public class SetDemo4 {
    public static void main(String[] args) {
        Set<Exam> exams = new LinkedHashSet<>();
        IntStream.rangeClosed(1, 20).forEach(i -> exams.add(new Exam()));
        System.out.println("全班成績: " + exams);
        System.out.println("1. 國文平均");
        // 印出所有國文成績
        exams.stream()
                .mapToInt(e -> e.getChinese())
                .forEach(score -> System.out.print(score + ", "));
        // 計算國文平均
        double avg_chinese = exams.stream()
                .mapToInt(e -> e.getChinese())
                .average()
                .getAsDouble();
        System.out.println("平均: " + avg_chinese);
        System.out.println("2. 英文平均");
        // 印出所有英文成績
        exams.stream()
                .mapToInt(e -> e.getEnglish())
                .forEach(score -> System.out.print(score + ", "));
        // 計算英文平均
        double avg_english = exams.stream()
                .mapToInt(e -> e.getEnglish())
                .average()
                .getAsDouble();
        System.out.println("平均: " + avg_english);
        System.out.println("3. 數學平均 (請同學自行撰寫)");
    }
}
