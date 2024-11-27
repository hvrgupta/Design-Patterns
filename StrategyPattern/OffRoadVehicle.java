package StrategyPattern;

import StrategyPattern.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
    
}
