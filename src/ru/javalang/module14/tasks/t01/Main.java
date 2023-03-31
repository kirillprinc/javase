package ru.javalang.module14.tasks.t01;

import ru.javalang.module06.tasks.t02.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("B", "M", "E123RT34", 2012));
        cars.add(new Car("C","AT","q456yh45", 2023));


        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getYers(), o2.getYers());
            }
        });

        for (Car car : cars) {
            System.out.println(car.getCatCar()+" "+car.getTransmission()+" "+car.getNomberCar());
        }

    }
}
