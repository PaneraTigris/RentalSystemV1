package dev.rentranger.rentalsystem;

import javax.persistence.*;

@Entity
public class AudioEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String type;
    private boolean available;

    //Constructors, getters, and setters
}