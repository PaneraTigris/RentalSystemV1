package dev.rentranger.rentalsystem.repository;

import dev.rentranger.rentalsystem.entity.UsedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsedItemRepository extends JpaRepository<UsedItem, Long> {
    List<UsedItem> findByAvailable(boolean available);
}