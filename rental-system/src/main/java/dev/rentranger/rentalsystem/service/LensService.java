package dev.rentranger.rentalsystem.service;

import dev.rentranger.rentalsystem.entity.Lens;
import dev.rentranger.rentalsystem.repository.LensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LensService {

    @Autowired
    private LensRepository lensRepository;

    public List<Lens> getAllLenses() {
        return lensRepository.findAll();
    }

    public Lens getLensById(Long id) {
        return lensRepository.findById(id).orElse(null);
    }

    public Lens addLens(Lens lens) {
        return lensRepository.save(lens);
    }

    public Lens updateLens(Lens lens) {
        return lensRepository.deleteById(id);
    }

    public void deleteLens(Long id) {
        lensRepository.deleteById(id);
    }

    public List<Lens> getAvailableLenses() {
        return lensRepository.findByAvailable(true);
    }
}