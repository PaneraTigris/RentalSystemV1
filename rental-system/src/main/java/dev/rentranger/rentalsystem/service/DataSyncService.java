package dev.rentranger.rentalsystem.service;

import dev.rentranger.rentalsystem.entity.Camera;
import dev.rentranger.rentalsystem.repository.CameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Sync logic to pull data from Lightspeed and update database
@Service
public class DataSyncService {

    @Autowired
    private LightspeedApiService lightspeedApiService;

    @Autowired
    private CameraRepository cameraRepository;

    public void syncInventory() {
        ResponseEntity<String> response = lightspeedApiService.getInventory();
        if (response.getStatusCode().is2xxSuccessful()) {
            // Parse response here, update database accordingly
            // Example: cameraRepository.save(new Camera(...));
        }
    }
}