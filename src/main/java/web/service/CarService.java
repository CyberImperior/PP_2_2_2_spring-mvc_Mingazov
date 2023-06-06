package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    public List<Car> makeCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Jiguli", 1997, "purple"));
        cars.add(new Car("Kopeyaka", 1990, "yellow"));
        cars.add(new Car("Delorean", 1980, "grey"));
        cars.add(new Car("Cayen", 2020, "white"));
        cars.add(new Car("Sanchez", 1995, "blue"));
        return cars;
    }

    public List<Car> getCountCars(Integer quantity) {
        List<Car> cars = new ArrayList<>();
        List<Car> fullCars = makeCarList();
        return fullCars.stream().limit(quantity).toList();
    }

}
