package com.ocp32_io;

import java.io.File;
import java.io.IOException;

public class CreateTempFiles {
    public static void main(String[] args) {
        File files = new File("src\\main\\java\\com\\ocp32_io\\files");
        if(files.exists()) {
            for(int i=0;i<10;i++) {
                try {
                    File tmpFile = File.createTempFile("temp", ".txt", files);
                    System.out.printf("建立 %s 成功\n", tmpFile);
                } catch (IOException e) {
                    System.out.println(e); // 印出簡要錯誤
                    e.printStackTrace(); // 印出詳細錯誤
                }
            }
        } else {
            System.out.printf("%s 不存在\n", files);
        }
    }
}
