package com.igrek.treydit.controller;

import com.igrek.treydit.domain.Treyder;
import com.igrek.treydit.service.TreyderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/treyder")
public class TreyderController {
    @Autowired
    private TreyderService treyderService;

    @PostMapping("/add")
    public String add(@RequestBody Treyder treyder){
        treyderService.saveTreyder(treyder);
        return "New Treyder is added";
    }

}
