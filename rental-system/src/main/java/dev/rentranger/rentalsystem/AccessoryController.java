package dev.rentranger.rental.controller;

import dev.rentranger.rental.entity.Accessory;
import dev.rentranger.rental.service.AccessoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accessories")
public class AccessoryController {

    @Autowired
    private AccessoryService accessoryService;

    @GetMapping
    public List<Accessory> getAllAccessories() {
        return accessoryService.getAllAccessories();
    }

    @GetMapping("/{id}")
    public Accessory getAccessoryById(@PathVariable Long id) {
        return accessoryService.getAccessoryById(id);
    }

    @PostMapping
    public Accessory addAccessory(@RequestBody Accessory accessory) {
        return accessoryService.addAccessory(accessory);
    }

    @PutMapping("/{id}")
    public Accessory updateAccessory(@PathVariable Long id, @RequestBody Accessory accessory) {
        accessory.setId(id);
        return accessoryService.updateAccessory(accessory);
    }

    @DeleteMapping("/{id}")
    public void deleteAccessory(@PathVariable Long id) {
        accessoryService.deleteAccessory(id);
    }

    @GetMapping("/available")
    public List<Accessory> getAvailableAccessories() {
        return accessoryService.getAvailableAccessories();
    }
}