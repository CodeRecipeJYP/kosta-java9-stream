package com.asuscomm.yangyicompany.d_applefilter;

import java.util.function.Consumer;

public class Apple {
    public String color;
    public int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Apple() {
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}' + '\n';
    }

    public static void printAppleInfo(Apple apple, Consumer<String> a) {
        a.accept(apple.toString());
    }
}
