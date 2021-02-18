package com.ocp33_nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesWriteDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\com\\ocp33_nio\\score.csv");
        String data = "\n99";
        Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
    }
}
