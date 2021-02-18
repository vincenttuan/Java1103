package com.ocp33_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo3 {
    public static void main(String[] args) {
        // 比較路徑
        Path p1 = Paths.get("C:/aaa/bbb/ccc/salary.txt");
        Path p2 = Paths.get("C:/aaa");
        Path p3 = Paths.get("salary.txt");
        System.out.println(p1.startsWith(p2)); // 起始是否相同
        System.out.println(p1.endsWith(p3)); // 結尾是否相同
                
    }
}
