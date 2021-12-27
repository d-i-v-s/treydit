package com.igrek.treydit.controller;

import com.igrek.treydit.domain.Inventory;
import com.igrek.treydit.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/add")
    private String add(@RequestBody Inventory inventory){
        inventoryService.saveInventory(inventory);
        return "New Inventory is added";
    }
}
