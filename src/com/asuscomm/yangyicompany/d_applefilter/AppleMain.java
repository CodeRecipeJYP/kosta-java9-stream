package com.asuscomm.yangyicompany.d_applefilter;

import java.util.List;

public class AppleMain {
    public static void main(String[] args) {
        System.out.print("Apple");

        List<Apple> inventory = List.of(
                new Apple("green", 150),
                new Apple("green", 140),
                new Apple("green", 130),
                new Apple("green", 120),
                new Apple("green", 110),
                new Apple("green", 100),
                new Apple("green", 90),
                new Apple("green", 80),
                new Apple("green", 70),
                new Apple("red", 150),
                new Apple("red", 100),
                new Apple("red", 90),
                new Apple("red", 70),
                new Apple("red", 50)
        );

        List<Apple> colorFiltered = Filter.filterApples(inventory,
                (apple) -> "green".equals(apple.color));

        System.out.println("" + colorFiltered);

        List<Apple> weightFiltered = Filter.filterApples(colorFiltered,
                (apple) -> apple.weight > 100);

        System.out.println("" + weightFiltered);
    }
}
