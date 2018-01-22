package com.asuscomm.yangyicompany.d_applefilter;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        return inventory.stream().filter(p).collect(Collectors.toList());
    }
}
