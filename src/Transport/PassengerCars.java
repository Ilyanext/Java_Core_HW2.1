package Transport;

public class PassengerCars extends Transport<DriverB> implements Competing {


    public PassengerCars(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void getType() {

    }

    public enum Body {
        SEDAN("Седан"),
        HETCHBEK("Хетчбэк"),
        KUPE("Купе"),
        UNIVERSAL("Универсал"),
        VNEDOROZNIC("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICAP("Пикап"),
        FURGON("Фургон"),
        MINIVEN("Минивэн");

        private String bodyName;

        Body(String bodyName) {
            this.bodyName = bodyName;
        }

        public String getBodyName() {
            return bodyName;
        }

        public void setBodyName(String bodyName) {
            this.bodyName = bodyName;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + bodyName;
        }
    }


    @Override
    public void pitStopabl() {
        System.out.println(" За 3 сек пит - стоп.");
    }

    @Override
    public void bestTimebl() {
        System.out.println(" Лучшее время 56 с.");
    }

    @Override
    public void maxSpeedaml() {
        System.out.println(" Максимальная скорость: 303 км/ч ");
    }

    @Override
    public void print() {
        System.out.println(("Марка автомобиля:  " + getBrand() + ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume()));
    }


//    public static void bodeNameCar(){
//        for (Body body: Body.values()) {
//            System.out.println("Тип кузова: " + body.getBodyName());
//        }
//    }
}

