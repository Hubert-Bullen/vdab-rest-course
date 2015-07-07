package be.vdab.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Hyuberuto on 06/07/15.
 */

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String licensePlate;

    @ManyToOne
    private CarModel model;

    public Car(CarModel model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public Car() {
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }
}
