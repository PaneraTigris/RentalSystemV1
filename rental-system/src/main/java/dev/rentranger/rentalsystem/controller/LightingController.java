package dev.rentranger.rentalsystem.controller;

import dev.rentranger.rentalsystem.entity.Lighting;
import dev.rentranger.rentalsystem.service.LightingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lightings")
public class LightingController {

    @Autowired
    private LightingService lightingService;

    @GetMapping
    public List<Lighting> getAllLightings() {
        return lightingService.getAllLightings();
    }

    @GetMapping("/{id}")
    public Lighting getLightingById(@PathVariable Long id) {
        return lightingService.getLightingById(id);
    }

    @PostMapping
    public Lighting addLighting(@RequestBody Lighting lighting) {
        return lightingService.addLighting(lighting);
    }

    @PutMapping("/{id}")
    public Lighting updateLighting(@PathVariable Long id, @RequestBody Lighting lighting) {
        lighting.setId(id);
        return lightingService.updateLighting(lighting);
    }

    @DeleteMapping("/{id}")
    public void deleteLighting(@PathVariable Long id) {
        lightingService.deleteLighting(id);
    }

    @GetMapping("/available")
    public List<Lighting> getAvailableLightings() {
        return lightingService.getAvailableLightings();
    }
}