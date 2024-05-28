package dev.rentranger.rentalsystem.repository;

import dev.rentranger.rentalsystem.entity.Tripod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripodRepository extends JpaRepository<Tripod, Long> {
    List<Tripod> findByAvailable(boolean available);
}