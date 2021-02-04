package com.ocp32_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

public class WriteTextIntoFile2 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\ocp32_io\\files\\data.txt");
        // 使用 try-with-resource 的語法
        try(Writer fw = new FileWriter(file, true)) { // true: 保留之前的資料
            fw.write("新年快樂 " + new Date() + "\n");
            System.out.println("寫檔成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
