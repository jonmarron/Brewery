package com.jontxu.Brewery.logic;

import com.jontxu.Brewery.data.Helper;
import com.jontxu.Brewery.data.MasterBrewer;
import com.jontxu.Brewery.data.Worker;
import com.jontxu.Brewery.data.beers.Beer;
import com.jontxu.Brewery.data.beers.BeerType;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
        if (worker instanceof MasterBrewer && alreadyHaveMAster()){
            throw new IllegalArgumentException("You can't add more Master Brewers than 1.");
        }
        workers.add(worker);
    }

    public Worker getMaster(){
        return workers.stream()
                .filter(worker -> worker instanceof MasterBrewer)
                .findFirst()
                .orElse(null);
    }
    private boolean alreadyHaveMAster() {
        return workers.stream()
                .anyMatch(worker -> worker instanceof MasterBrewer);
    }
    private void makeBeers(BeerType beerType, String name, int alcoholContent){

        int numOfHelpers =(int) workers.stream()
                .filter(worker -> worker instanceof Helper && ((Helper) worker).daysOfWeek.contains(LocalDate.now().getDayOfWeek()))
                .count();
        Worker master = getMaster();
        for (int i = 0; i < numOfHelpers; i++) {
            Beer beerToAdd = master.makeBeer(beerType, name, alcoholContent);
        }

    }

    public List<Beer> getStock() {
        return stock;
    }

    public List<Worker> getWorkers() {
        return workers;
    }
}
