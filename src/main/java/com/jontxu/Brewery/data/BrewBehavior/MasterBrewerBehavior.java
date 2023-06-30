package com.jontxu.Brewery.data.BrewBehavior;

import com.jontxu.Brewery.data.beers.Beer;
import com.jontxu.Brewery.data.beers.BeerType;

public class MasterBrewerBehavior implements MakeBrewBehavior {
    @Override
    public Beer makeBeer(BeerType beerType, String name, int alcoholContent) {
        return new Beer(beerType, name, alcoholContent);
    }
}
