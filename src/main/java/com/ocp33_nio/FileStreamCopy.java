package com.ocp33_nio;

import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileStreamCopy {
    public static void main(String[] args) throws Exception {
        String urlstr = "https://img.ltn.com.tw/Upload/business/page/800/2020/05/26/240.jpg";
        Path target = Paths.get("src\\main\\java\\com\\ocp33_nio\\iCar.jpg");
        Files.copy(new URL(urlstr).openStream(), target, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Stream Copy ok");
    }
}
