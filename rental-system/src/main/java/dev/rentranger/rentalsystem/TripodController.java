package dev.rentranger.rentalsystem;

import dev.rentranger.rental.entity.Tripod;
import dev.rentranger.rental.service.TripodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tripods")
public class TripodController {

    @Autowired
    private TripodService tripodService;

    @GetMapping
    public List<Tripod> getAllTripods() {
        return tripodService.getAllTripods();
    }

    @GetMapping("/{id}")
    public Tripod getTripodById(@PathVariable Long id) {
        return tripodService.getTripodById(id);
    }

    @PostMapping
    public Tripod addTripod(@RequestBody Tripod tripod) {
        return tripodService.addTripod(tripod);
    }

    @PutMapping("/{id}")
    public Tripod updateTripod(@PathVariable Long id, @RequestBody Tripod tripod) {
        tripod.setId(id);
        return tripodService.updateTripod(tripod);
    }

    @DeleteMapping("/{id}")
    public void deleteTripod(@PathVariable Long id) {
        tripodService.deleteTripod(id);
    }

    @GetMapping("/available")
    public List<Tripod> getAvailableTripods() {
        return tripodService.getAvailableTripods();
    }
}