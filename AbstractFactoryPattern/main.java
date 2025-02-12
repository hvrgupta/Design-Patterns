package AbstractFactoryPattern;

public class main {
    public static void main(String[] args) {
        VehicleFactory factory;

        String type = "Tesla";

        if (type.equalsIgnoreCase("Tesla")) {
            factory = new TeslaFactory();
        } else {
            factory = new YamahaFactory();
        }

        vehicle vehicle = factory.createVehicle();
        vehicle.drive();
    }
}
