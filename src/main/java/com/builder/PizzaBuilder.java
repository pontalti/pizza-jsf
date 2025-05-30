package com.builder;

import com.model.Pizza;

public class PizzaBuilder extends GenericFoodBuilder<Pizza, PizzaBuilder> {

    public PizzaBuilder(Integer size) {
        super();
        super.size = size;
        super.cheese = Boolean.FALSE;
        super.tomato = Boolean.FALSE;
        super.bacon = Boolean.FALSE;
    }

    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder withCheese(Boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder withTomato(Boolean tomato) {
        this.tomato = tomato;
        return this;
    }

    public PizzaBuilder withBacon(Boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    public PizzaBuilder setSize(Integer size) {
        this.size = size;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }

}