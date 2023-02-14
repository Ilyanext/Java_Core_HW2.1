package Transport;

public class Bus extends Transport<DriverC> implements Competing {


    public Bus(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void getType() {

    }

    public enum Places {
        VERYSMOL(null, 10),
        SMOL(null, 25),
        MEDIUM(25, 50),
        BIG(50, 80),
        VERYBIG(80, 120);

        private Integer miniPlaces;
        private Integer maxPlaces;

        Places(Integer miniPlaces, Integer maxPlaces) {
            this.miniPlaces = miniPlaces;
            this.maxPlaces = maxPlaces;
        }

        public Integer getMiniPlaces() {
            return miniPlaces;
        }

        public void setMiniPlaces(Integer miniPlaces) {
            this.miniPlaces = miniPlaces;
        }

        public Integer getMaxPlaces() {
            return maxPlaces;
        }

        public void setMaxPlaces(Integer maxPlaces) {
            this.maxPlaces = maxPlaces;
        }

        @Override
        public String toString() {
            return "Вместимость: " + (miniPlaces == null ? "" : "от " + miniPlaces) +
                    ", " + (maxPlaces == null ? "" : " до " + maxPlaces);
        }
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
}
