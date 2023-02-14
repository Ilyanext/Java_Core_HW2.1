package Transport;

public abstract class Transport<T extends Driver> implements GetType {
    private String brand;
    private String model;
    private double engineVolume;

    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = chekParmetrs(brand);
        this.model = chekParmetrs(model);
        this.engineVolume = chekParmetrs(engineVolume);
        setDriver(driver);
    }

    public enum Type implements GetType {
        PASSENGERCARS,
        BUS,
        TRUCKS,
        DEFAULT;

        @Override
        public void getType() {
        }

        public static Transport.Type printType(String name) {
            switch (name) {
                case "PASSENGERCARS":
                    System.out.println(Type.valueOf("PASSENGERCARS"));
                    break;
                case "BUS":
                    System.out.println(Type.valueOf("BUS"));
                    break;
                case "TRUCKS":
                    System.out.println(Type.valueOf("TRUCKS"));
                    break;
                default:
                    System.out.println("Данных по трансортному средству недостаточно.");
            }
            return null;
        }

    }

    public void startMoving() {
        System.out.println("Start moving");
    }

    public void stopMoving() {
        System.out.println("Stop moving");
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String chekParmetrs(String parametr) {
        if (parametr == null || parametr.isEmpty()) {
            parametr = "default";
        }
        return parametr;
    }

    public double chekParmetrs(double parametr) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        return parametr;
    }

    public T getDriver() {
        return driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

}
