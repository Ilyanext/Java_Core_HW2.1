package Transport;

public class Trucks  extends Transport <DriverD> implements  Competing{


    public Trucks(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void pitStopabl() {
        System.out.println(" За 11 сек пит - стоп.");
    }

    @Override
    public void bestTimebl() {
        System.out.println(" Лучшее время 104 с.");
    }

    @Override
    public void maxSpeedaml() {
        System.out.println(" Максимальная скорость: 180 км/ч ");
    }
    @Override
    public void print() {
        System.out.println(("Марка автомобиля:  " + getBrand() + ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume()));

    }
}
