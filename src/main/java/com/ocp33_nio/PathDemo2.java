package com.ocp33_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {
    public static void main(String[] args) {
        // 路徑結合 resolve()
        Path p1 = Paths.get("C:/aaa/bbb/ccc");
        Path p2 = Paths.get("ddd/salary.txt"); // "/ddd/salary.txt"
        p1 = p1.resolve(p2);
        System.out.println(p1);
    }
}
