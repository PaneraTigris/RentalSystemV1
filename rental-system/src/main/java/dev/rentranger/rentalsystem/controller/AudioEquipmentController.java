package dev.rentranger.rentalsystem.controller;

import dev.rentranger.rentalsystem.entity.AudioEquipment;
import dev.rentranger.rentalsystem.service.AudioEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/audioequipments")
public class AudioEquipmentController {

    @Autowired
    private AudioEquipmentService audioEquipmentService;

    @GetMapping
    public List<AudioEquipment> getAllAudioEquipments() {
        return audioEquipmentService.getAllAudioEquipments();
    }

    @GetMapping("/{id}")
    public AudioEquipment getAudioEquipmentById(@PathVariable Long id) {
        return audioEquipmentService.getAudioEquipmentById(id);
    }

    @PostMapping
    public AudioEquipment addAudioEquipment(@RequestBody AudioEquipment audioEquipment) {
        return audioEquipmentService.addAudioEquipment(audioEquipment);
    }

    @PutMapping("/{id}")
    public AudioEquipment updateAudioEquipment(@PathVariable Long id, @RequestBody AudioEquipment audioEquipment) {
        audioEquipment.setId(id);
        return audioEquipmentService.updateAudioEquipment(audioEquipment);
    }

    @DeleteMapping("/{id}")
    public void deleteAudioEquipment(@PathVariable Long id) {
        audioEquipmentService.deleteAudioEquipment(id);
    }

    @GetMapping("/available")
    public List<AudioEquipment> getAvailableAudioEquipments() {
        return audioEquipmentService.getAvailableAudioEquipments();
    }
}