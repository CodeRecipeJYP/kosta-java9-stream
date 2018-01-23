package com.asuscomm.yangyicompany.m_optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<Integer> any = Stream.of(1, 2, 3, 4, 5)
                .filter(i -> i > 4)
                .findAny();

        any.ifPresent(i -> System.out.println("Any: " + i));

        Optional<Integer> none = Stream.of(1, 2, 3, 4, 5)
                .filter(i -> i > 5)
                .findAny();

        none.ifPresent(i -> System.out.println("None: " + i));
    }
}
