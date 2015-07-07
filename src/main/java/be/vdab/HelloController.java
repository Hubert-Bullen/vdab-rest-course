package be.vdab;

import be.vdab.domain.Car;
import be.vdab.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Hyuberuto on 06/07/15.
 */

@Controller
@RequestMapping("api")
public class HelloController {

    @Autowired
    private CarRepository carRepository;

/*
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam("") int id){
        return carRepository.findAll().toString();
    }

    @RequestMapping("/world/{id}")
    @ResponseBody
    public String world(@PathVariable("") int id){ // We kunnen er hier meerder definiëren en in de mapping er nog bij zette!
        return "World";
    }
*/
    @RequestMapping(value = "/car/{carId}", produces = "test/hyu") // Dus /api/car/1 bijvoorbeeld.
    @ResponseBody
    public Car findById(@PathVariable("carId") int id){
        return carRepository.findOne(id);
    }

    @RequestMapping("car/all")
    @ResponseBody
    public List<Car> findAll(){
        return carRepository.findAll();
    }

    @RequestMapping(value = "/car/{carId}") // Dus /api/car/1 bijvoorbeeld.
    @ResponseBody
    public void saveCar(@RequestBody Car c){
    }

}
