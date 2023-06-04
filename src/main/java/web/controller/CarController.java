package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCars(ModelMap model) {
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }

    @GetMapping("/cars")
    public String getCarLimit(@RequestParam(defaultValue = "0") int count, ModelMap model) {
        List<Car> cars = carService.getAllCars();
        if (count > 0 && count <= cars.size()) {
            cars = cars.subList(0, count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}