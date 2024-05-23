package dev.rentranger.rental.controller;

import dev.rentranger.rental.entity.Projector;
import dev.rentranger.rental.service.ProjectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projectors")
public class ProjectorController {

    @Autowired
    private ProjectorService projectorService;

    @GetMapping
    public List<Projector> getAllProjectors() {
        return projectorService.getAllProjectors();
    }

    @GetMapping("/{id}")
    public Projector getProjectorById(@PathVariable Long id) {
        return projectorService.getProjectorById(id);
    }

    @PostMapping
    public Projector addProjector(@RequestBody Projector projector) {
        return projectorService.addProjector(projector);
    }

    @PutMapping("/{id}")
    public Projector updateProjector(@PathVariable Long id, @RequestBody Projector projector) {
        projector.setId(id);
        return projectorService.updateProjector(projector);
    }

    @DeleteMapping("/{id}")
    public void deleteProjector(@PathVariable Long id) {
        projectorService.deleteProjector(id);
    }

    @GetMapping("/available")
    public List<Projector> getAvailableProjectors() {
        return projectorService.getAvailableProjectors();
    }
}