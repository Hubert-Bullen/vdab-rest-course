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

    private String name;

    @ManyToOne
    private Make make;

    @OneToMany(mappedBy = "model")
    @JsonIgnore
    private List<Car> cars;

    @Enumerated(value = EnumType.STRING)
    private CarEngine engine;

    private int pk;

    public CarModel(String name, Make make, List<Car> cars, CarEngine engine, int pk) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
