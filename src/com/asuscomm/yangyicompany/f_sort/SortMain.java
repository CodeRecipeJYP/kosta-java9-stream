package com.asuscomm.yangyicompany.f_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMain {
    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 450, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 300, Dish.Type.OTHER),
                new Dish("spagetti", true, 400, Dish.Type.NOODLE),
                new Dish("apple", true, 300, Dish.Type.FRUIT),
                new Dish("melon", true, 320, Dish.Type.FRUIT),
                new Dish("salmon", true, 420, Dish.Type.FISH),
                new Dish("prawn", true, 410, Dish.Type.FISH)
        );

        List<String> collect = dishes.stream()
                .filter(dish -> dish.calories < 400)
                .sorted(Comparator.comparing(dish -> dish.calories))
                .map(dish -> dish.name)
                .collect(Collectors.toList())
                .subList(0, 2);

        System.out.println(collect);

    }
}
