package com.lq.demos.transport;

import java.time.LocalDate;

public class StationWagon extends Car{

    private int cargoCapacity;
    private int currentCargoLoad;

    public StationWagon(String name, LocalDate manufactureDate, int maxSpeed, int... tires) {
        super(name, manufactureDate, maxSpeed, tires);
    }

    public void setCurrentCargoLoad(int currentCargoLoad) {
        this.currentCargoLoad = currentCargoLoad;
    }
}
