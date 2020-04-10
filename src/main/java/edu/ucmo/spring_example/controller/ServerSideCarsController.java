package edu.ucmo.spring_example.controller;

import edu.ucmo.spring_example.dao.CarDao;
import edu.ucmo.spring_example.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServerSideCarsController {

    @Autowired
    CarDao carDao;

    @RequestMapping(value = "/server_cars")
    public String index(Model model) {
        Iterable<Car> allCars = carDao.findAll();
        model.addAttribute("cars", allCars);
        return "server_cars";
    }

}
