package dev.rentranger.rentalsystem;

import dev.rentranger.rental.entity.AudioEquipment;
import dev.rentranger.rental.repository.AudioEquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudioEquipmentService {

    @Autowired
    private AudioEquipmentRepository audioEquipmentRepository;

    public List<AudioEquipment> getAllAudioEquipments() {
        return audioEquipmentRepository.findAll();
    }

    public AudioEquipment getAudioEquipmentById(Long id) {
        return audioEquipmentRepository.findById(id).orElse(null);
    }

    public AudioEquipment addAudioEquipment(AudioEquipment audioEquipment) {
        return audioEquipmentRepository.save(audioEquipment);
    }

    public AudioEquipment updateAudioEquipment(AudioEquipment audioEquipment) {
        return audioEquipmentRepository.save(audioEquipment);
    }

    public void deleteAudioEquipment(Long id) {
        audioEquipmentRepository.deleteById(id);
    }

    public List<AudioEquipment> getAvailableAudioEquipments() {
        return audioEquipmentRepository.findByAvailable(true);
    }
}