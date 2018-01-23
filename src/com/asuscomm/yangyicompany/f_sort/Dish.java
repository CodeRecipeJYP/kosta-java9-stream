package com.asuscomm.yangyicompany.f_sort;

public class Dish {
    public String name;
    public boolean vegeterian;
    public int calories;
    public Type type;

    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    public enum Type {
        MEAT, OTHER, NOODLE, FRUIT, FISH
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
