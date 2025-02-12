package AbstractFactoryPattern;

public class YamahaFactory implements VehicleFactory {

    @Override
    public vehicle createVehicle() {
        return new Yamaha();
    }

}
