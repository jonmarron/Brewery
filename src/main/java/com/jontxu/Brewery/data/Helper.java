package com.jontxu.Brewery.data;

import com.jontxu.Brewery.data.BrewBehavior.NoBrewBehavior;

import java.time.DayOfWeek;
import java.util.List;

public class Helper extends Worker {
    public final List<DayOfWeek> daysOfWeek;
    public Helper(String name, int expYears, List<DayOfWeek> daysOfWeek) {
        super(name, expYears);
        this.daysOfWeek = daysOfWeek;
        makeBeerBehavior = new NoBrewBehavior();
    }

    public List<DayOfWeek> getDaysOfWeek() {
        return daysOfWeek;
    }
}
