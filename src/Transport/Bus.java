package Transport;

public class Bus extends Transport {

    public Bus(String brand, String model, String color, int year, String country, int speed) {
        super(brand, model, color, year, country, speed);
    }

    public void print() {
        System.out.println("Марка автобуса:  " + getBrand() + ", модель: " + getModel() +
                ", " + "цвет кузова: " + getColor() +", год выпуска: " + getYear() +
                ", произведен в стране:  " + getCountry()+", speed:  "+ getSpeed() );

    }
}
