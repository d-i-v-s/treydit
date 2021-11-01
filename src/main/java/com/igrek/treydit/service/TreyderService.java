package com.igrek.treydit.service;

import com.igrek.treydit.dao.TreyderDao;
import com.igrek.treydit.model.Treyder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreyderService {
    
    private  final TreyderDao treyderDao;

    @Autowired
    public TreyderService(@Qualifier("fakeTreyderDao") TreyderDao treyderDao) {
        this.treyderDao = treyderDao;
    }

    public int addTreyder(Treyder treyder){
        return treyderDao.addTreyder(treyder);
    }

    public List<Treyder> getAllTreyder(){
        return treyderDao.selectAllTreyder();
    }
}
