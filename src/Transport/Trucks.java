package Transport;

public class Trucks extends Transport<DriverD> implements Competing {


    public Trucks(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void getType() {

    }

    public enum LoadCapacity {
        N1(0, 3.5F),
        N2(3.5F, 12),
        N3(12, 0);

        private float mincapacity;
        private float maxcapacity;

        LoadCapacity(float mincapacity, float maxcapacity) {
            this.mincapacity = mincapacity;
            this.maxcapacity = maxcapacity;
        }

        public float getMincapacity() {
            return mincapacity;
        }

        public float getMaxcapacity() {
            return maxcapacity;
        }

        public void setMincapacity(float mincapacity) {
            this.mincapacity = mincapacity;
        }

        public void setMaxcapacity(float maxcapacity) {
            this.maxcapacity = maxcapacity;
        }

        @Override
        public String toString() {
            return "Грузоподъемность: " + (mincapacity == 0 ? "" : "от " + mincapacity) +
                    (maxcapacity == 0 ? "" : " до " + maxcapacity);
        }
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

//    public static void capacityNumber() {
//        for (LoadCapacity capacity : LoadCapacity.values()) {
//            System.out.println("Грузоподъемность: " + (capacity.getMincapacity() == 0 ? "" : "от " + capacity.getMincapacity()) + (capacity.getMaxcapacity() == 0 ? "" : " до " + capacity.getMaxcapacity()));
//        }
//    }
}
