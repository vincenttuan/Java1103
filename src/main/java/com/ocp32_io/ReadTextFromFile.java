package com.ocp32_io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadTextFromFile {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\ocp32_io\\files\\data.txt");
        // 使用 try-with-resource 的語法
        try(Reader r = new FileReader(file)) {
            int data = 0;
            String allData = "";
            while ( (data = r.read()) != -1  ) {                
                //System.out.print((char)data);
                allData += (char)data;
            }
            System.out.printf("檔案內容: %s\n", allData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
