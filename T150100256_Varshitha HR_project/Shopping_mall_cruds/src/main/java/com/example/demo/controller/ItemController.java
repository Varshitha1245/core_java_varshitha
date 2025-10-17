package com.example.demo.controller;

//src/main/java/com/example/demo/controller/ItemController.java



import com.example.demo.entity.ItemEntity;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

 @Autowired
 private ItemService itemService;

 // POST: Create a new item
 // URL: POST http://localhost:8080/api/items
 @PostMapping
 public ResponseEntity<ItemEntity> createItem(@RequestBody ItemEntity item) {
     ItemEntity savedItem = itemService.saveItem(item);
     return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
 }

 // GET: Get all items
 // URL: GET http://localhost:8080/api/items
 @GetMapping
 public List<ItemEntity> getAllItems() {
     return itemService.getAllItems();
 }

 // GET: Get item by ID
 // URL: GET http://localhost:8080/api/items/{id}
 @GetMapping("/{id}")
 public ResponseEntity<ItemEntity> getItemById(@PathVariable Long id) {
     return itemService.getItemById(id)
             .map(ResponseEntity::ok)
             .orElse(ResponseEntity.notFound().build());
 }

 // PUT: Update an existing item (full update)
 // URL: PUT http://localhost:8080/api/items/{id}
 @PutMapping("/{id}")
 public ResponseEntity<ItemEntity> updateItem(@PathVariable Long id, @RequestBody ItemEntity itemDetails) {
     return ((ItemService) itemService).getItemById(id)
             .map(existingItem -> {
                 // Update all fields
                 existingItem.setName(itemDetails.getName());
                 existingItem.setCategory(itemDetails.getCategory());
                 existingItem.setPrice(itemDetails.getPrice());
                 existingItem.setStockQuantity(itemDetails.getStockQuantity());
                 
                 return new ResponseEntity<>(itemService.saveItem(existingItem), HttpStatus.OK);
             })
             .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
 }

 // DELETE: Delete an item
 // URL: DELETE http://localhost:8080/api/items/{id}
 @DeleteMapping("/{id}")
 public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
     if (itemService.deleteItem(id)) {
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
     }
     return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 }
}
