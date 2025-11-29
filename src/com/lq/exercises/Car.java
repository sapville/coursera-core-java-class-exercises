package com.lq.exercises;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Car {

    private final String name;
    private final LocalDate manufactureDate;
    private final int maxSpeed;

    public Car(String name, LocalDate manufactureDate, int maxSpeed) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.maxSpeed = maxSpeed;
    }

    public int getAge() {
        return Period.between(manufactureDate, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("Car %s is of %d yeas old and has maximum speed %d km/h", getName(), getAge(), getMaxSpeed());
    }

    public static void main(String[] args) {
        Car[] cars = {
                new Car("Car 1", LocalDate.of(1975, 1, 1), 120),
                new Car("Car 2", LocalDate.of(2024, 10, 2), 220)
        };

        Arrays.stream(cars).forEach(System.out::println);
    }

}
