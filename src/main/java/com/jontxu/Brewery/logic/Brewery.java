package com.jontxu.Brewery.logic;

import com.jontxu.Brewery.data.Worker;
import com.jontxu.Brewery.data.beers.Beer;

import java.util.List;

public class Brewery {
    private final List<Worker> workers;
    private final List<Beer> stock;

    public Brewery(List<Worker> workers, List<Beer> stock) {
        this.workers = workers;
        this.stock = stock;
    }

    public boolean hasCertainAmountByName(int amount, String name){
        long count = stock.stream()
                .filter(beer -> beer.getName().equalsIgnoreCase(name))
                .count();
        return count >= amount;
    }


}
