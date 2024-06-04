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

    private boolean available;
    private String customerName;
    private LocalDate rentalDate;
    private LocalDate returnDate;

    // Constructors, getters, and setters
    public Rental() {}

    public Rental(boolean available, String customerName, LocalDate rentalDate, LocalDate returnDate) {
        this.available = available;
        this.customerName = customerName;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.camera = new Camera();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {return customerName;}
    public void setCustomerName(String customerName) {this.customerName = customerName;}

    public LocalDate getRentalDate() {return rentalDate;}
    public void setRentalDate(LocalDate rentalDate) {this.rentalDate = rentalDate;}

    public LocalDate getReturnDate() {return returnDate;}
    public void setReturnDate(LocalDate returnDate) {this.returnDate = returnDate;}

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}