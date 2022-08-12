package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model,
                            @RequestParam("count") int count) {
        if (carService == null) {
            carService = new CarServiceImpl();
        }
        if (count > 5) {
            count = 5;
        }

        List<Car> cars = carService.getListCars(count);
        model.addAttribute("carsAttribute", cars);

        return "cars";
    }
}
