package dev.rentranger.rental.controller;

import dev.rentranger.rental.service.LightSpeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lightspeed")
public class LightSpeedController {

    @Autowired
    private LightSpeedService lightSpeedService;

    @GetMapping("/inventory")
    public String getInventory() {
        return lightSpeedService.getInventory();
    }

    // ADD ENDPOINTS FOR OTHER API INTERACTIONS HERE AS NEEDED
}