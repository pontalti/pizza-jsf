package com.builder;

import lombok.Getter;

@Getter
public abstract class GenericFoodBuilder<T, B> {

    protected Integer size;
    protected Boolean cheese;
    protected Boolean tomato;
    protected Boolean bacon;
    protected String name;

    public abstract B setSize(Integer size);

    public abstract B withCheese(Boolean cheese);

    public abstract B withTomato(Boolean tomato);

    public abstract B withBacon(Boolean bacon);

    public abstract T build();

}