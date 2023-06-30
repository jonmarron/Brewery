package com.jontxu.Brewery.data.BrewBehavior;

import com.jontxu.Brewery.data.beers.Beer;
import com.jontxu.Brewery.data.beers.BeerType;

public class NoBrewBehavior implements MakeBrewBehavior {
    @Override
    public Beer makeBeer(BeerType beerType, String name, int alcoholContent) {
        throw new UnsupportedOperationException("Helpers can't make beers by themselves");
    }
}
