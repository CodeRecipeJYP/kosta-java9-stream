package com.asuscomm.yangyicompany.g_buildstream;

import java.util.stream.Stream;

public class BuildMain {
    public static void main(String[] args) {
        Stream.of("1", "2", "3")
                .map(s -> "Number: " + s)
                .forEach(System.out::println);

        Stream.generate(() -> "-1")
                .map(s -> "Number: " + s)
                .limit(4)
                .forEach(System.out::println);

        Stream.iterate(0, n -> n + 1)
                .map(s -> "Number: " + s)
                .limit(4)
                .forEach(System.out::println);
    }
}
