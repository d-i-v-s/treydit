package com.igrek.treydit.service;

import com.igrek.treydit.domain.Treyder;
import com.igrek.treydit.persistence.TreyderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreyderServiceImpl implements TreyderService {

    @Autowired
    private TreyderRepository treyderRepository;

    @Override
    public Treyder saveTreyder(Treyder treyder) {
        return treyderRepository.save(treyder);
    }
}
