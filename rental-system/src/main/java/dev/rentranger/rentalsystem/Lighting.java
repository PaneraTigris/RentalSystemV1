package dev.rentranger.rental.entity;

import javax.persistence.*;

@Entity
public class Lighting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String type;
    private boolean available;

    //Constructors, getters, and setters
}