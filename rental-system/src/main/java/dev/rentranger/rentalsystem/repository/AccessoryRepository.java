package dev.rentranger.rentalsystem.repository;

import dev.rentranger.rentalsystem.entity.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Long> {
    List<Accessory> findByAvailable(boolean available);
}