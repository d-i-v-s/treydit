package com.igrek.treydit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;


public class Item {

    public enum condition{GOOD,USABLE,BAD};

    private final UUID id;
    private final String name;
    private final double cost;
    private final String description;
    public condition condition;

    public Item(@JsonProperty("id") UUID id,@JsonProperty("name") String name,@JsonProperty("cost") double cost,@JsonProperty("description") String description,@JsonProperty("condition") condition condition){
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.condition = condition;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public Item.condition getCondition() {
        return condition;
    }

    public void setCondition(Item.condition condition) {
        this.condition = condition;
    }
}
