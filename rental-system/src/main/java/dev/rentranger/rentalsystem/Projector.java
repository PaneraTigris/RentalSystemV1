package dev.rentranger.rental.entity;

import javax.persistence.*;

@Entity
public class Projector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String resolution;
    private boolean available;

    //Constructors, getters, and setters
}