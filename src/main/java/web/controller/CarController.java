package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    //@Autowired
    private static CarService carService = new CarService();

    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "0") int count, Model model) {
        List<Car> cars;
        if (count < 1) {
            cars = carService.getCarList();
        } else {
            cars = carService.getCarListByCount(count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}