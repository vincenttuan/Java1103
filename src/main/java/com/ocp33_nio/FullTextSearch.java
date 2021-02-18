package com.ocp33_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FullTextSearch {
    static int count = 0;
    public static void main(String[] args) throws Exception {
        // 總共寫了幾隻 Java 程式
        String path = "C:\\Users\\MB-207\\Documents\\NetBeansProjects\\Java1103\\src\\main\\java";
        Stream<Path> paths = Files.walk(Paths.get(path));
        paths.parallel()
            .filter(p -> p.toString().contains(".java"))
            .filter(p -> {
                try {
                    return Files.lines(p).filter(s -> s.contains("money")).findFirst().isPresent();
                } catch (Exception e) {
                }
                return false;
            })
            .forEach(p -> {
            try {
                Path p2 = p.toAbsolutePath();
                System.out.print(++count + ".");
                System.out.print(p2 + " : ");
                System.out.println(Files.readAttributes(p2, BasicFileAttributes.class).creationTime());
            } catch (Exception e) {
            }
        });
        
    }
}
