package com.igrek.treydit.dao;

import com.igrek.treydit.model.Treyder;

import java.util.UUID;

public interface TreyderDao {
    //adding treyder to the database

    //first methode: adding treyder with a given id
    int insertTreyder(UUID id, Treyder treyder);

    //second methode: adding treyder without a id
    default int addTreyder(Treyder treyder){
        UUID id = UUID.randomUUID();
        return insertTreyder(id, treyder);
    }
}
