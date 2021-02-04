package com.ocp32_io;

import java.io.File;
import java.io.IOException;

// 建立資料夾 .../ocp32_io/files 資料夾
public class CreateFolder {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\ocp32_io";
        File folder = new File(path);
        // 確認 folder 是否是資料夾 ?
        if(folder.isDirectory()) {
            // 建立 files 資料夾
            //File files = new File("src\\main\\java\\com\\ocp32_io\\files");
            // folder.getPath() -> "src\\main\\java\\com\\ocp32_io"
            // File.separator -> "\\"
            File files = new File(folder.getPath() + File.separator + "files");
            // 確認 files 是否已經被建立 ?
            if(files.exists()) {
                System.out.printf("%s 目錄已經被建立\n", files);
            } else {
                System.out.printf("建立 %s 目錄: ", files);
                try {
                    // check 會得到是否建立成功的 boolean 值
                    boolean check = files.createNewFile();
                    if(check) {
                        System.out.println("成功");
                    } else {
                        System.out.println("失敗");
                    }
                } catch (IOException e) {
                    System.out.printf("錯誤: %s\n", e);    
                }
            }
        } else {
            System.out.printf("%s 不是資料夾\n", folder);
        }
    }
}
