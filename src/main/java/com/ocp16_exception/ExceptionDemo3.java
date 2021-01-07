package com.ocp16_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo3 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\main\\java\\com\\ocp16_exception\\number2.txt");
//        try {
//            Scanner sc = new Scanner(file);
//            System.out.println("找到檔案了");
//        } catch (FileNotFoundException e) {
//            System.out.println("找不到檔案");
//        }
        Scanner sc = new Scanner(file);
        System.out.println("找到檔案了");
    }
}
