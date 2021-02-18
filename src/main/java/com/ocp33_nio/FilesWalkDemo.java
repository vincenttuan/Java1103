package com.ocp33_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesWalkDemo {
    public static void main(String[] args) throws Exception {
        // 尋訪家目錄下面的所有路徑與檔案(包含子目錄)
        // 並列出路徑/檔案名稱與建立時間
        Stream<Path> paths = Files.walk(Paths.get(System.getProperty("user.home")));
        paths.forEach(f -> {});
        
    }
}
