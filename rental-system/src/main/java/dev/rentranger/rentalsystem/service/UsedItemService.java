package dev.rentranger.rentalsystem.service;

import dev.rentranger.rentalsystem.entity.UsedItem;
import dev.rentranger.rentalsystem.repository.UsedItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsedItemService {

    @Autowired
    private UsedItemRepository usedItemRepository;

    public List<UsedItem> getAllUsedItems() {
        return usedItemRepository.findAll();
    }

    public UsedItem getUsedItemById(Long id) {
        return usedItemRepository.findById(id).orElse(null);
    }

    public UsedItem addUsedItem(UsedItem usedItem) {
        return usedItemRepository.save(usedItem);
    }

    public UsedItem updateUsedItem(UsedItem usedItem) {
        return usedItemRepository.save(usedItem);
    }

    public void deleteUsedItem(Long id) {
        usedItemRepository.deleteById(id);
    }

    public List<UsedItem> getAvailableUsedItems() {
        return usedItemRepository.findByAvailable(true);
    }
}