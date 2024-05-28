package dev.rentranger.rentalsystem.service;

import dev.rentranger.rentalsystem.entity.Projector;
import dev.rentranger.rentalsystem.repository.ProjectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectorService {

    @Autowired
    private ProjectorRepository projectorRepository;

    public List<Projector> getAllProjectors() {
        return projectorRepository.findAll();
    }

    public Projector getProjectorById(Long id) {
        return projectorRepository.findById(id).orElse(null);
    }

    public Projector addProjector(Projector projector) {
        return projectorRepository.save(projector);
    }

    public Projector updateProjector(Projector projector) {
        return projectorRepository.save(projector);
    }

    public void deleteProjector(Long id) {
        projectorRepository.deleteById(id);
    }

    public List<Projector> getAvailableProjectors() {
        return projectorRepository.findByAvailable(true);
    }
}