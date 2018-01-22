package com.asuscomm.yangyicompany.h_nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class NioMain {
    public static void main(String[] args) {

        long uniqueWords = 0;
        try {
            uniqueWords = Files.lines(Paths.get("src/com/asuscomm/yangyicompany/h_nio/data.txt"), Charset.defaultCharset())
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .peek(System.out::println)
                    .count();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("There are " + uniqueWords + " unique words in data2.txt");
    }
}
