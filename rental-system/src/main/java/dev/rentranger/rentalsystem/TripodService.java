package dev.rentranger.rental.service;

import dev.rentranger.rental.entity.Tripod;
import dev.rentranger.rental.repository.TripodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripodService {

    @Autowired
    private TripodRepository tripodRepository;

    public List<Tripod> getAllTripods() {
        return tripodRepository.findAll();
    }

    public Tripod getTripodById(Long id) {
        return tripodRepository.findById(id).orElse(null);
    }

    public Tripod addTripod(Tripod tripod) {
        return tripodRepository.save(tripod);
    }

    public Tripod updateTripod(Tripod tripod) {
        return tripodRepository.save(tripod);
    }

    public void deleteTripod(Long id) {
        tripodRepository.deleteById(id);
    }

    public List<Tripod> getAvailableTripods() {
        return tripodRepository.findByAvailable(true);
    }
}