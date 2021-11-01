package com.igrek.treydit.dao;

import com.igrek.treydit.model.Item;

import java.util.List;
import java.util.UUID;

public interface ItemDao {
    int insertItem(UUID id, Item item);

    default int addItem(Item item){
        UUID id = UUID.randomUUID();
        return insertItem(id, item);
    }
    List<Item> selectAllItem();
}
