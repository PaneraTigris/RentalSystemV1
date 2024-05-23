package dev.rentranger.rentalsystem;

import javax.persistence.*;

@Entity
public class Accessory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private boolean available;

    //Constructors, getters, and setters
}