package NullDesignPattern;

public class VehicleFactory {
    static Vehicle getVehicle(String typeOfVehicle) {
        if ("Car".equals(typeOfVehicle)) {
            return new Car();
        }
        return new NullVehicle();
    }
}
