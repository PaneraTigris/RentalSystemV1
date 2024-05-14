package dev.rentranger.rental.repository;

import dev.rentranger.rental.entity.AudioEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AudioEquipmentRepository extends JpaRepository<AudioEquipment, Long> {
    List<AudioEquipment> findByAvailable(boolean available);
}