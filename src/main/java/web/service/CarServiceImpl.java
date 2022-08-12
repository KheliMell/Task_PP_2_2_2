package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getListCars(int count) {
        List<Car> cars = new ArrayList<>();
        for (int i = 1; i < count + 1; i++) {
            cars.add(new Car(i, "Model " + i, "Owner " + i));
        }
        return cars;
    }
}
