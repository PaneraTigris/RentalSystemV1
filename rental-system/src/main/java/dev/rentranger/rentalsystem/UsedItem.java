package dev.rentranger.rentalsystem;

import javax.persistence.*;

@Entity
public class UsedItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String condition;
    private boolean available;

    //Constructors, getters, and setters
}