package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private static final List<Car> cars;
    static {
        cars = new ArrayList<>();
        for (int i = 1; i < 6 + 1; i++) {
            cars.add(new Car(i, "Model " + i, "Owner " + i));
        }
    }

    @Override
    public List<Car> getListCars(int count) {
        return cars.subList(0, count);
    }
}
