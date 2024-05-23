package dev.rentranger.rentalsystem;
import javax.persistence.*;

@Entity
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private String brand;
    private String serialNumber;
    private boolean available;
    // Constructors, getters, and setters
}