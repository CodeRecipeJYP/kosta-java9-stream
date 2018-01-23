package com.asuscomm.yangyicompany.j_reduce;

import com.asuscomm.yangyicompany.f_sort.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceMain {
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

        Optional<Integer> reduce = dishes.stream()
                .map(dish -> dish.calories)
                .reduce((i1, i2) -> i1 + i2);

        int sum = dishes.stream()
                .mapToInt(dish -> dish.calories)
                .sum();

        Optional<Integer> reduce1 = dishes.stream()
                .map(dish -> dish.calories)
                .reduce(Integer::sum);

        System.out.println(reduce.get());
    }
}
