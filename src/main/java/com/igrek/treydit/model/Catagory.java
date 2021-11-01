package com.igrek.treydit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Catagory {
    public final UUID id;
    public final String name;

    public Catagory(@JsonProperty("id")UUID id,@JsonProperty("name") String name) {
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
