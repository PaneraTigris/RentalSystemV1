package dev.rentranger.rental.controller;

import dev.rentranger.rental.entity.UsedItem;
import dev.rentranger.rental.service.UsedItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/useditems")
public class UsedItemController {

    @Autowired
    private UsedItemService usedItemService;

    @GetMapping
    public List<UsedItem> getAllUsedItems() {
        return usedItemService.getAllUsedItems();
    }

    @GetMapping("/{id}")
    public UsedItem getUsedItemById(@PathVariable Long id) {
        return usedItemService.getUsedItemById(id);
    }

    @PostMapping
    public UsedItem addUsedItem(@RequestBody UsedItem usedItem) {
        return usedItemService.addUsedItem(usedItem);
    }

    @PutMapping("/{id}")
    public UsedItem updateUsedItem(@PathVariable Long id, @RequestBody UsedItem usedItem) {
        usedItem.setId(id);
        return usedItemService.updateUsedItem(usedItem);
    }

    @DeleteMapping("/{id}")
    public void deleteUsedItem(@PathVariable Long id) {
        usedItemService.deleteUsedItem(id);
    }

    @GetMapping("/available")
    public List<UsedItem> getAvailableUsedItems() {
        return usedItemService.getAvailableUsedItems();
    }
}