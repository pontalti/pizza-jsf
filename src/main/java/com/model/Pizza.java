package com.model;

import com.builder.PizzaBuilder;
import lombok.Data;

@Data
public class Pizza implements Comparable<Pizza> {

    private String name;
    private Integer size;
    private Boolean cheese;
    private Boolean tomato;
    private Boolean bacon;

    public Pizza(PizzaBuilder builder) {
        super();
        this.name = builder.getName();
        this.size = builder.getSize();
        this.cheese = builder.getCheese();
        this.tomato = builder.getTomato();
        this.bacon = builder.getBacon();
    }

    @Override
    public int compareTo(Pizza o) {
        return this.name.compareToIgnoreCase(o.getName());
    }

}