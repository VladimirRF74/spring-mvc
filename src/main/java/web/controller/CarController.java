package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.serves.CarsServes;

@Controller
public class CarController {

    private final CarsServes carsServes;

    public CarController(CarsServes carsServes) {
        this.carsServes = carsServes;
    }

    @GetMapping(value = "/cars")
    public String showList(@RequestParam(value = "count", required = false) Integer count, ModelMap modelMap) {
        modelMap.addAttribute("showList", carsServes.showListCarsToCount(count));
        return "cars";

    }

}
