package com.igrek.treydit.dao;

import com.igrek.treydit.model.Treyder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Repository("fakeTreyderDao")
public class FakeTreyderDataAccessService implements TreyderDao{

    private static List<Treyder> DB = new ArrayList<>();

    @Override
    public int insertTreyder(UUID id, Treyder treyder) {
        DB.add(new Treyder(id, treyder.getName()));
        return 1;
    }

    @Override
    public List<Treyder> selectAllTreyder() {
        return DB;
    }


}
