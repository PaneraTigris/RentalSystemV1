package dev.rentranger.rentalsystem.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "camera_id")
    private Camera camera;

    private String customerName;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private double price;

    // Constructors, getters, and setters
}