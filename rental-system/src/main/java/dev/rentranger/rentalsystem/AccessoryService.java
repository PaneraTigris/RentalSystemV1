package dev.rentranger.rental.service;

import dev.rentranger.rental.entity.Accessory;
import dev.rentranger.rental.repository.AccessoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessoryService {

    @Autowired
    private AccessoryRepository accessoryRepository;

    public List<Accessory> getAllAccessories() {
        return accessoryRepository.findAll();
    }

    public Accessory getAccessoryById(Long id) {
        return accessoryRepository.findById(id).orElse(null);
    }

    public Accessory addAccessory(Accessory accessory) {
        return accessoryRepository.save(accessory);
    }

    public Accessory updateAccessory(Accessory accessory) {
        return accessoryRepository.save(accessory);
    }

    public void deleteAccessory(Long id) {
        accessoryRepository.deleteById(id);
    }

    public List<Accessory> getAvailableAccessories() {
        return accessoryRepository.findByAvailable(true);
    }
}