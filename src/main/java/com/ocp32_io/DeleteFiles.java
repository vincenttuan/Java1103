package com.ocp32_io;

import java.io.File;
import java.util.Arrays;

public class DeleteFiles {
    public static void main(String[] args) {
        File files = new File("src\\main\\java\\com\\ocp32_io\\files");
        if(files.exists()) {
            // 印出 files 內的內容(檔案s或資料夾s名稱)
            System.out.println(Arrays.toString(files.list()));
            // 刪除 temp 為首的檔案
            for(String fname : files.list()) {
                if(fname.contains("temp")) {
                    File delFile = new File(files.getPath() + File.separator + fname);
                    delFile.delete();
                }
            }
            System.out.println(Arrays.toString(files.list()));
        } else {
            System.out.printf("%s 不存在\n", files);
        }
    }
}
