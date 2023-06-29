package com.jontxu.Brewery.data;

import java.util.List;

public record Worker(String name, int expYears, List<WorkDays> workDays, Position position) {
}
