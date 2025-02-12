package AbstractFactoryPattern;

public class TeslaFactory implements VehicleFactory {

    @Override
    public vehicle createVehicle() {
       return new Tesla();
    }
    
}
