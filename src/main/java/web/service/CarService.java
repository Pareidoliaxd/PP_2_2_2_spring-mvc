package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car("Audi", "R8", 217145));
        carList.add(new Car("Nissan", "Skyline", 202013));
        carList.add(new Car("Mersedes", "Gelik", 666));
        carList.add(new Car("Toyota", "RAV4", 330));
        carList.add(new Car("Chevrolet", "Imbarvet", 81794));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getCarListByCount(int count) {
        if (count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}

/*4L, */