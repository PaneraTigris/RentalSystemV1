package dev.rentranger.rentalsystem;

import javax.persistence.*;

@Entity
public class Lens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String focalLength;
    private boolean available;

    // Constructors, getters, and setters
}