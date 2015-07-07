package be.vdab.domain;

import javax.persistence.*;
/**
 * Created by Hyuberuto on 07/07/15.
 */

@Entity
public class Make {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String brand;

    public Make(String brand) {
        this.brand = brand;
    }

    public Make() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
