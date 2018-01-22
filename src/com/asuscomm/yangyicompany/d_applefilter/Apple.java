package com.asuscomm.yangyicompany.d_applefilter;

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
}
