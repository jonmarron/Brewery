package com.jontxu.Brewery.data;

import com.jontxu.Brewery.data.BrewBehavior.MakeBrewBehavior;
import com.jontxu.Brewery.data.beers.Beer;
import com.jontxu.Brewery.data.beers.BeerType;

public abstract class Worker {
    MakeBrewBehavior makeBeerBehavior;
    private final String name;
    private final int expYears;

    public Worker(String name, int expYears) {
        this.name = name;
        this.expYears = expYears;
    }
    public Beer makeBeer(BeerType beerType, String name, int alcoholContent){
        return makeBeerBehavior.makeBeer(beerType, name, alcoholContent);
    }
    public String getName() {
        return name;
    }

    public int getExpYears() {
        return expYears;
    }
}
