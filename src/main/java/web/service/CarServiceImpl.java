package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 1, "vin1"));
        cars.add(new Car("model2", 2, "vin2"));
        cars.add(new Car("model3", 3, "vin3"));
        return cars;
    }
}
