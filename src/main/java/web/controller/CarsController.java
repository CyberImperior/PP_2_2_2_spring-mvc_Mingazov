package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
public class CarsController {
    @Autowired
    private  CarService carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            Model model) {
        if (count == null) {
            count = carService.makeCarList().size();
        }
        if (count < 0 && count > 4) {
            model.addAttribute("cars", carService.makeCarList()) ;
        } else {
            model.addAttribute("cars", carService.getCountCars(count)) ;
        }
        return "cars";
    }
}
