package dev.rentranger.rentalsystem;

import dev.rentranger.rental.entity.Projector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectorRepository extends JpaRepository<Projector, Long> {
    List<Projector> findByAvailable(boolean available);
}