package be.vdab.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Hyuberuto on 07/07/15.
 */

@Entity
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Make make;

    @OneToMany
    private List<Car> cars;

    @Enumerated(value = EnumType.STRING)
    private CarEngine engine;

    private int pk;

    public CarModel(Make make, List<Car> cars, CarEngine engine, int pk) {
        this.make = make;
        this.cars = cars;
        this.engine = engine;
        this.pk = pk;
    }

    public CarModel() {
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
