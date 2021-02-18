package com.ocp33_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src\\main\\java\\com\\ocp33_nio\\PathDemo.java");
        System.out.printf("filename: %s\n", path.getFileName());
        System.out.printf("parent: %s\n", path.getParent());
        System.out.printf("root: %s\n", path.getRoot());
        System.out.printf("namecount: %s\n", path.getNameCount());
        System.out.printf("subpath(0, 3): %s\n", path.subpath(0, 3));
        System.out.printf("isAbsolute: %s\n", path.isAbsolute());
        System.out.printf("toAbsolutePath: %s\n", path.toAbsolutePath());
        System.out.printf("toUri: %s\n", path.toUri());
    }
}
