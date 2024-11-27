package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();

        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();
    }
}
