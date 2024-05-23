package dev.rentranger.rentalsystem;

import javax.persistence.*;

@Entity
public class Tripod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private boolean available;

    //Constructors, getters, and setters
}