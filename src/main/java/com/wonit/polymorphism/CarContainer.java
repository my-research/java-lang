package com.wonit.polymorphism;

import java.util.List;
import lombok.Data;

@Data
public class CarContainer {
    private List<Car> cars;

    public void add(Car car) {
        cars.add(car);
    }
}
