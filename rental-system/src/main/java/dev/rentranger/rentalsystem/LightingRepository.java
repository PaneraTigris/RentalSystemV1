package dev.rentranger.rental.repository;

import dev.rentranger.rental.entity.Lighting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LightingRepository extends JpaRepository<Lighting, Long> {
    List<Lighting> findByAvailable(boolean available);
}