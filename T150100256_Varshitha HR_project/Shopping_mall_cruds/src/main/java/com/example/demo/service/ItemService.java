package com.example.demo.service;

//src/main/java/com/example/demo/service/ItemService.java



import com.example.demo.entity.ItemEntity;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

 @Autowired
 private ItemRepository itemRepository;

 // 1. CREATE/UPDATE
 public ItemEntity saveItem(ItemEntity item) {
     return itemRepository.save(item);
 }

 // 2. READ ALL
 public List<ItemEntity> getAllItems() {
     return itemRepository.findAll();
 }

 // 3. READ BY ID
 public Optional<ItemEntity> getItemById(Long id) {
     return itemRepository.findById(id);
 }

 // 4. DELETE
 public boolean deleteItem(Long id) {
     if (itemRepository.existsById(id)) {
         itemRepository.deleteById(id);
         return true;
     }
     return false;
 }

 // 5. UPDATE (specific business logic for stock)
 public Optional<ItemEntity> updateStock(Long id, int newQuantity) {
     Optional<ItemEntity> itemOptional = itemRepository.findById(id);
     if (itemOptional.isPresent()) {
         ItemEntity item = itemOptional.get();
         item.setStockQuantity(newQuantity);
         return Optional.of(itemRepository.save(item));
     }
     return Optional.empty();
 }
}