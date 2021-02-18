package com.ocp33_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FilesWalkDemo2 {
    static int count = 0;
    public static void main(String[] args) throws Exception {
        // 總共寫了幾隻 Java 程式
        String path = "C:\\Users\\MB-207\\Documents\\NetBeansProjects\\Java1103\\src\\main\\java";
        Stream<Path> paths = Files.walk(Paths.get(path));
        paths.filter(f -> f.toString().contains(".java"))
            .forEach(f -> {
            try {
                Path p = f.toAbsolutePath();
                System.out.print(++count + ".");
                System.out.print(f + " : ");
                System.out.println(Files.readAttributes(p, BasicFileAttributes.class).creationTime());
            } catch (Exception e) {
            }
        });
        
    }
}
