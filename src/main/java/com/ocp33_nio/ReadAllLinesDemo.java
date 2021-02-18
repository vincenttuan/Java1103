package com.ocp33_nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAllLinesDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src\\main\\java\\com\\ocp33_nio\\score.csv");
        // 1. BufferedRead + FileReader
        try(FileReader fr = new FileReader(path.toFile());
            BufferedReader br = new BufferedReader(fr);) {
            br.lines().forEach(System.out::print);
        } catch (Exception e) {
        }
    }
}
