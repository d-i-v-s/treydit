package com.igrek.treydit.dao;

import com.igrek.treydit.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeItemDao")
public class FakeItemDataAccessService implements ItemDao {

    private static List<Item> DB = new ArrayList<>();

    @Override
    public int insertItem(UUID id, Item item) {
        DB.add(new Item(id, item.getName(),item.getCost(),item.getDescription(),item.getCondition()));
        return 1;
    }


    @Override
    public List<Item> selectAllItem() {
        return DB;
    }
}
