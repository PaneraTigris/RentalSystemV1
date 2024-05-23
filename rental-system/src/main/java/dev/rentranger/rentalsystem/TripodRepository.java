package dev.rentranger.rentalsystem;

import dev.rentranger.rental.entity.Tripod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripodRepository extends JpaRepository<Tripod, Long> {
    List<Tripod> findByAvailable(boolean available);
}