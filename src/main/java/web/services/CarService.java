package web.services;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("Owner1", "Lada", 1998),
            new Car("Owner2", "BMW", 2000),
            new Car("Owner3", "Mercedes", 2002),
            new Car("Owner4", "Toyota", 2004),
            new Car("Owner5", "Mini", 2006)));

    public List<Car> getCars() {
        return cars;
    }
}
