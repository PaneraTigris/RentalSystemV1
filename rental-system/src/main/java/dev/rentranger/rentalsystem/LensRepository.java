package dev.rentranger.rental.repository;

import dev.rentranger.rental.entity.Lens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LensRepository extends JpaRepository<Lens, Long> {
    List<Lens> findByAvailable(boolean available);
}