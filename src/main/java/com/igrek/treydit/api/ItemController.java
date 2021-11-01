package com.igrek.treydit.api;

import com.igrek.treydit.model.Item;
import com.igrek.treydit.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/item")
@RestController
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }
    @PostMapping
    public void addTreyder(@RequestBody Item item){
        itemService.addItem(item);
    }
    @GetMapping
    public List<Item> getAllItem(){
        return itemService.getAllItems();
    }
}
