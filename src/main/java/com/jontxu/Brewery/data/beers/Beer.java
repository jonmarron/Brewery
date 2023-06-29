package com.jontxu.Brewery.data.beers;

public class Beer {
    private final BeerType beerType;
    private final String name;
    private final int alcoholContent;
    private final StrengthLevel strengthLevel;

    public Beer(BeerType beerType, String name, int alcoholContent) {
        this.beerType = beerType;
        this.name = name;
        this.alcoholContent = alcoholContent;
        strengthLevel = calculateStrengthLevel();
    }

    private StrengthLevel calculateStrengthLevel() {
        return alcoholContent < 3 ? StrengthLevel.LIGHT :
                alcoholContent > 6 ? StrengthLevel.STRONG : StrengthLevel.MEDIUM;
    }

    public BeerType getBeerType() {
        return beerType;
    }

    public String getName() {
        return name;
    }

    public int getAlcoholContent() {
        return alcoholContent;
    }

    public StrengthLevel getStrengthLevel() {
        return strengthLevel;
    }
}
