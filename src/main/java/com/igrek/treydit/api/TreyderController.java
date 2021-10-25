package com.igrek.treydit.api;

import com.igrek.treydit.model.Treyder;
import com.igrek.treydit.service.TreyderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/treyder")
@RestController
public class TreyderController {

    private final TreyderService treyderService;

    @Autowired
    public TreyderController(TreyderService treyderService) {
        this.treyderService = treyderService;
    }

    // Methode adds treyder to the datbase
    @PostMapping
    public void addTreyder(@RequestBody Treyder treyder){
        treyderService.addTreyder(treyder);
    }
}
