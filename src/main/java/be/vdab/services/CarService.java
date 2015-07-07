package be.vdab.services;

import be.vdab.domain.Car;
import be.vdab.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Hyuberuto on 07/07/15.
 */

@RestController // Nu staat op alle methoden ook al een @Responsebody!
@RequestMapping("car")
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping("/{carId}")
    public Car findById(@PathVariable("carId") int id){
        return carRepository.findOne(id);
    }

    @RequestMapping("/all")
    public List<Car> findAll(){
        return carRepository.findAll();
    }

/*    @RequestMapping(value = "/{carId}" ,method = RequestMethod.POST)
    public void createCar(@RequestBody Car c){
        c = new Car("987-02");
        carRepository.save(c);
    }*/






}
