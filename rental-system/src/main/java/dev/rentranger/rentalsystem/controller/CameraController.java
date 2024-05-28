package dev.rentranger.rentalsystem.controller;

import dev.rentranger.rentalsystem.entity.Camera;
import dev.rentranger.rentalsystem.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cameras")
public class CameraController {

    @Autowired
    private CameraService cameraService;

    @GetMapping
    public List<Camera> getAllCameras() {
        return cameraService.getAllCameras();
    }

    @GetMapping("/{id}")
    public Camera getCameraById(@PathVariable Long id) {
        return cameraService.getCameraById(id);
    }

    @PostMapping
    public Camera addCamera(@RequestBody Camera camera) {
        return cameraService.addCamera(camera);
    }

    @PutMapping("/{id}")
    public Camera updateCamera(@PathVariable Long id, @RequestBody Camera camera) {
        camera.setId(id);
        return cameraService.updateCamera(camera);
    }

    @DeleteMapping("/{id}")
    public void deleteCamera(@PathVariable Long id) {
        cameraService.deleteCamera(id);
    }

    @GetMapping("/available")
    public List<Camera> getAvailableCameras() {
        return cameraService.getAvailableCameras();
    }
}