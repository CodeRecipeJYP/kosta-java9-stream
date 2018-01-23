package com.asuscomm.yangyicompany.n_joining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningMain {
    public static void main(String[] args) {
        String collect = Stream.of("hellooo", "joining")
                .collect(Collectors.joining(", ", "Joining: ", "[period]"));
        System.out.println(collect);
    }
}
