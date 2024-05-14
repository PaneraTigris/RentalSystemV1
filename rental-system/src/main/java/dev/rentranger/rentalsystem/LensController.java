package dev.rentranger.rental.controller;

import dev.rentranger.rental.entity.Lens;
import dev.rentranger.rental.service.LensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lenses")
public class LensController {

    @Autowired
    private LensService lensService;

    @GetMapping
    public List<Lens> getAllLenses() {
        return lensService.getAllLenses();
    }

    @GetMapping("/{id}")
    public Lens getLensById(@PathVariable Long id) {
        return lensService.getLensById(id);
    }

    @PostMapping
    public Lens addLens(@RequestBody Lens lens) {
        return lensService.addLens(lens);
    }

    @PutMapping("/{id}")
    public Lens updateLens(@PathVariable Long id, @RequestBody Lens lens) {
        lens.setId(id);
        return lensService.updateLens(lens);
    }

    @DeleteMapping("/{id}")
    public void deleteLens(@PathVariable Long id) {
        lensService.deleteLens(id);
    }

    @GetMapping("/available")
    public List<Lens> getAvailableLenses() {
        return lensService.getAvailableLenses();
    }

}