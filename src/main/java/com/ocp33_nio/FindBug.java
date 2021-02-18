package com.ocp33_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class FindBug {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\ocp33_nio\\score.csv");
        Optional<String> opt = Files.readAllLines(path)
                .stream()
                .peek(s -> System.out.println(s))
                .filter(s -> s.contains("bug"))
                .parallel()
                //.sequential()
                .findFirst();
        System.out.println(opt.isPresent());
    }
}
