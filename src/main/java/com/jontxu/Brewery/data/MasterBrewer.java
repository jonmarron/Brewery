package com.jontxu.Brewery.data;

import com.jontxu.Brewery.data.BrewBehavior.MasterBrewerBehavior;

public class MasterBrewer extends Worker {

    public MasterBrewer(String name, int expYears) {
        super(name, expYears);
        makeBeerBehavior = new MasterBrewerBehavior();
    }



}
