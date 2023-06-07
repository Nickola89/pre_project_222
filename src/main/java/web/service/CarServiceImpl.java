package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("model1", 1, "vin1"));
        cars.add(new Car("model2", 2, "vin2"));
        cars.add(new Car("model3", 3, "vin3"));
        cars.add(new Car("model4", 4, "vin4"));
        cars.add(new Car("model5", 5, "vin5"));
    }

    @Override
    public List<Car> getAllCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
