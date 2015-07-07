package be.vdab.services;

import be.vdab.domain.Car;
import be.vdab.domain.CarModel;
import be.vdab.domain.Make;
import be.vdab.repositories.CarRepository;
import be.vdab.repositories.MakeRepository;
import be.vdab.repositories.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

/**
 * Created by Hyuberuto on 07/07/15.
 */

@RestController // Nu staat op alle methoden ook al een @Responsebody!
@RequestMapping("car")
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ModelRepository modelRepository;

    @Autowired
    private MakeRepository makeRepository;

    @RequestMapping("/{carId}")
    public Car findById(@PathVariable("carId") int id){
        return carRepository.findOne(id);
    }

    @RequestMapping("/all/cars")
    public List<Car> findAll(){
        return carRepository.findAll();
    }

    @RequestMapping("/all/models")
    public List<CarModel> findAllModels(){
        return modelRepository.findAll();
    }

    @RequestMapping("/all/makes")
    public List<Make> findAllMake(){
        return makeRepository.findAll();
    }

    @RequestMapping(value = "/create" ,method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE) // .GET is de default!
    public ResponseEntity<Void> createCar(@RequestBody Car c){
        carRepository.save(c);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "http://localhost:8080/car/" + c.getId());
        ResponseEntity<Void> response = new ResponseEntity<Void>(headers, HttpStatus.CREATED);
        return response;
    }

    @RequestMapping(value = "/{carId}", method = RequestMethod.DELETE)
    public void removeById(@PathVariable("carId") int id){
        carRepository.delete(id);
    }

    // Laatste 2 moeten gedaan worden via een extar tool omdat een delete en create niet gedaan kunnen worden via de browser.
    // in deze tool de http method aan passen, header bijvoegen met contenttype en wat we dus verwachten. en dan bij de body links text invoege in de stijl van het content-type.
    // Als we in json dan een object wilel zetten bij het createen (dus een modal bij car) kunnen we gewoon de id meegeven.








}
