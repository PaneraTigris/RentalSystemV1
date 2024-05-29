package dev.rentranger.rentalsystem.entity;

import javax.persistence.*;

@Entity
public class AudioEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String name;
    private String type;
    private boolean available;

    //Constructors, getters, and setters
    public AudioEquipment() {}

    public AudioEquipment(String name, String type, boolean available, String brand) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.available = available;
    }

    public String getBrand() {return this.brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}