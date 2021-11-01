package com.igrek.treydit.service;

import com.igrek.treydit.dao.ItemDao;
import com.igrek.treydit.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemDao itemDao;

    @Autowired
    public ItemService(@Qualifier("fakeItemDao") ItemDao itemDao){
        this.itemDao = itemDao;
    }
    public int addItem(Item item){
        return itemDao.addItem(item);
    }
    public List<Item> getAllItems(){
        return itemDao.selectAllItem();
    }
}
