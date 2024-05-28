package dev.rentranger.rentalsystem.repository;

import dev.rentranger.rentalsystem.entity.Projector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectorRepository extends JpaRepository<Projector, Long> {
    List<Projector> findByAvailable(boolean available);
}