package com.ocp32_io;

import java.io.File;

// 建立資料夾 .../ocp32_io/files 資料夾
public class CreateFolder {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\ocp32_io";
        File folder = new File(path);
        // 確認 folder 是否是資料夾 ?
        if(folder.isDirectory()) {
        
        } else {
            System.out.printf("%s 不是資料夾\n", folder);
        }
    }
}
