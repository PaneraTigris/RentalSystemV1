package dev.rentranger.rentalsystem.service;

import dev.rentranger.rentalsystem.entity.Camera;
import dev.rentranger.rentalsystem.entity.Lens;
import dev.rentranger.rentalsystem.repository.CameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CameraService {

    @Autowired
    private CameraRepository cameraRepository;

    public List<Camera> getAllCameras() {
        return cameraRepository.findAll();
    }

    public Camera getCameraById(Long id) {
        return cameraRepository.findById(id).orElse(null);
    }

    public Camera addCamera(Camera camera) {
        return cameraRepository.save(camera);
    }

    public Camera updateCamera(Camera camera) {
        return cameraRepository.save(camera);
    }

    public void deleteCamera(Long id) {
        cameraRepository.deleteById(id);
    }

    public List<Camera> getAvailableCameras() {
        return cameraRepository.findByAvailable(true);
    }
}