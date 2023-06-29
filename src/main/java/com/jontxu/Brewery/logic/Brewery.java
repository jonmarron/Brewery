package com.jontxu.Brewery.logic;

import com.jontxu.Brewery.data.Position;
import com.jontxu.Brewery.data.Worker;
import com.jontxu.Brewery.data.beers.Beer;

import java.util.ArrayList;
import java.util.List;

public class Brewery {
    private final List<Worker> workers;
    private final List<Beer> stock;

    public Brewery() {
        workers = new ArrayList<>();
        stock = new ArrayList<>();
    }

    public boolean hasCertainAmountByName(int amount, String name){
        long count = stock.stream()
                .filter(beer -> beer.getName().equalsIgnoreCase(name))
                .count();
        return count >= amount;
    }

    public void addWorker(Worker worker){
        if (worker.position().equals(Position.MASTER_BREWER) && alreadyHaveMAster()){
            throw new IllegalArgumentException("You can't add more Master Brewers than 1.");
        }
        workers.add(worker);
    }

    private boolean alreadyHaveMAster() {
        return workers.stream()
                .anyMatch(worker -> worker.position().equals(Position.MASTER_BREWER));
    }

    public List<Beer> getStock() {
        return stock;
    }

    public List<Worker> getWorkers() {
        return workers;
    }
}
