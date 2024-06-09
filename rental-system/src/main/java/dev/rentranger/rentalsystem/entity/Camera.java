package dev.rentranger.rentalsystem.entity;
import jakarta.persistence.*;

@Entity
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String model;
    private String brand;
    private String serialNumber;
    private boolean available;

    // Constructors, getters, and setters
    public Camera() {}

    public Camera(String name, boolean available, String brand, String serialNumber, String model) {
        this.brand = brand;
        this.name = name;
        this.available = available;
        this.model = model;
        this.serialNumber = serialNumber;
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

    public String getModel() {return this.model;}
    public void setModel(String model) {this.model = model;}

    public String getSerialNumber() {return this.serialNumber;}
    public void setSerialNumber(String serialNumber) {this.serialNumber = serialNumber;}

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}