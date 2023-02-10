package Transport;

public class Bus  extends Transport <DriverC> implements Competing {


    public Bus(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void pitStopabl() {
        System.out.println(" За 6 сек пит - стоп.");
    }

    @Override
    public void bestTimebl() {
        System.out.println(" Лучшее время 72 с.");
    }

    @Override
    public void maxSpeedaml() {
        System.out.println(" Максимальная скорость: 234 км/ч ");
    }

    @Override
    public void print() {
        System.out.println(("Марка автомобиля:  " + getBrand() + ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume()));

    }
    //    public Bus(String brand, String model, String color, int year, String country, int speed) {
//        super(brand, model, color, year, country, speed);
//    }
//
//    public void print() {
//        System.out.println("Марка автобуса:  " + getBrand() + ", модель: " + getModel() +
//                ", " + "цвет кузова: " + getColor() +", год выпуска: " + getYear() +
//                ", произведен в стране:  " + getCountry()+", speed:  "+ getSpeed() );
//
//    }
}
