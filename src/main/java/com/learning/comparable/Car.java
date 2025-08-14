package com.learning.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Car implements Comparable<Car> {

    String name;

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Car car) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return this.name == ((Car) o).name;
    }

    public static void main(String[] args) {
        Comparator<Car> tComparator = Comparator.naturalOrder();
        List<Car> carList = Arrays.asList(new Car(), new Car());
        Collections.sort(carList);

        carList.sort(Comparator.comparing(Car::getName));
    }
}
