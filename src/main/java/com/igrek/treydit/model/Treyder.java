package com.igrek.treydit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Treyder {
    //model for treyder
    private final UUID id;
    private final String name;
    //hallo
    public Treyder(@JsonProperty("id") UUID id,
                   @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
