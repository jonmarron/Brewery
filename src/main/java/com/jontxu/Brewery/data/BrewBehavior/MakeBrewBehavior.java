package com.jontxu.Brewery.data.BrewBehavior;

import com.jontxu.Brewery.data.beers.Beer;
import com.jontxu.Brewery.data.beers.BeerType;

public interface MakeBrewBehavior {
    Beer makeBeer(BeerType beerType, String name, int alcoholContent);
}
