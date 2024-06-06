package dev.rentranger.rentalsystem.controller;

import dev.rentranger.rentalsystem.service.LightspeedApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lightspeed")
public class LightSpeedController {

    @Autowired
    private LightspeedApiService lightspeedApiService;

    @GetMapping("/inventory")
    public ResponseEntity<String> getInventory() {
        return lightspeedApiService.getInventory();
    }

    // ADD ENDPOINTS FOR OTHER API INTERACTIONS HERE AS NEEDED
}