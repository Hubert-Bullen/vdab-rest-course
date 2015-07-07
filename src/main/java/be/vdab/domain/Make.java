package be.vdab.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Hyuberuto on 07/07/15.
 */

@Entity(name = "car_make")
public class Make {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private Brand brand;

   @OneToMany
    private List<CarModel> models;


    public Make(Brand brand, List<CarModel> models) {
        this.brand = brand;
        this.models = models;
    }


    public Make() {
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }


    public List<CarModel> getModels() {
        return models;
    }

    public void setModels(List<CarModel> models) {
        this.models = models;
    }
}
