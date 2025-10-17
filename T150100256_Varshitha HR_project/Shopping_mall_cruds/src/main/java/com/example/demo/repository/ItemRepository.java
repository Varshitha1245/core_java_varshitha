package com.example.demo.repository;
//src/main/java/com/example/demo/repository/ItemRepository.java



import com.example.demo.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
 // Custom repository methods can be added here if needed,
 // e.g., List<ItemEntity> findByCategory(String category);
}