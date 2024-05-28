package dev.rentranger.rentalsystem.service;

import dev.rentranger.rentalsystem.entity.Lighting;
import dev.rentranger.rentalsystem.repository.LightingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LightingService {

    @Autowired
    private LightingRepository lightingRepository;

    public List<Lighting> getAllLightings() {
        return lightingRepository.findAll();
    }

    public Lighting getLightingById(Long id) {
        return lightingRepository.findById(id).orElse(null);
    }

    public Lighting addLighting(Lighting lighting) {
        return lightingRepository.save(lighting);
    }

    public Lighting updateLighting(Lighting lighting) {
        return lightingRepository.save(lighting);
    }

    public void deleteLighting(Long id) {
        lightingRepository.deleteById(id);
    }

    public List<Lighting> getAvailableLightings() {
        return lightingRepository.findByAvailable(true);
    }
}