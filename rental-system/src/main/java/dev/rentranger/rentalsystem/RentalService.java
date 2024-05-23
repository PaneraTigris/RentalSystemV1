package dev.rentranger.rentalsystem;

import dev.rentranger.rental.entity.Rental;
import dev.rentranger.rental.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    public Rental getRentalById(Long id) {
        return rentalRepository.findById(id).orElse(null);
    }

    public Rental addRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    public Rental updateRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    public void deleteRental(Long id) {
        rentalRepository.deleteById(id);
    }

    public List<Rental> getRentalsByCameraId(Long cameraId) {
        return rentalRepository.findByCameraId(cameraId);
    }
}