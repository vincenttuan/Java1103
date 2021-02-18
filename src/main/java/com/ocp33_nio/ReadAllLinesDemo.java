package com.ocp33_nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLinesDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src\\main\\java\\com\\ocp33_nio\\score.csv");
        // 1. BufferedRead + FileReader
        try(FileReader fr = new FileReader(path.toFile());
            BufferedReader br = new BufferedReader(fr);) {
            br.lines().forEach(System.out::print);
        } catch (Exception e) {
        }
        System.out.println();
        // 2. Files.newBufferedReader
        try(BufferedReader br = Files.newBufferedReader(path)) {
            br.lines().forEach(System.out::print);
        } catch (Exception e) {
        }
        System.out.println();
        // 3. Files.readAllLines (會得到一個 List 集合)
        try {
            List<String> list = Files.readAllLines(path);
            list.forEach(System.out::print);
        } catch (Exception e) {
        }
        System.out.println();
        // 4. Files.lines
        try {
            Files.lines(path).forEach(System.out::print);
        } catch (Exception e) {
        }
        
        
    }
}
