package com.asuscomm.yangyicompany.i_flatmap;

import java.util.stream.Stream;

public class FlatMain {
    public static void main(String[] args) {
//        System.out.println("flatmap");
//        Stream.of(1, 0, 1, 3, 4)
//        Stream.of(1)
//                .flatMap(i -> Stream.of(i, 0))
//        .forEach(System.out::println);

        Stream.of("hello", "world")
                .map(s -> s + " ")
                .flatMap(str -> Stream.of(str.split("")))
//                        .peek(s -> System.out.println("log = " + s))
//                        .(data -> data.concat(" ")))
                        .forEach(System.out::println);

//        streamB = (streamA + " ")
    }
}
