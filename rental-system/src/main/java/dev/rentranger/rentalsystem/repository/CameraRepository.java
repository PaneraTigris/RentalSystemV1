package dev.rentranger.rentalsystem.repository;

import dev.rentranger.rentalsystem.entity.Camera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CameraRepository extends JpaRepository<Camera, Long> {
    List<Camera> findByAvailable(boolean available);
}