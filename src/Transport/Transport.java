package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = chekParmetrs(brand);
        this.model = chekParmetrs(model);
        this.engineVolume = chekParmetrs(engineVolume);
    }

    public void startMoving (){
        System.out.println("Start moving");
    }
    public void stopMoving (){
        System.out.println("Stop moving");
    }


//    private String color;
//    private final int year;
//    private final String country;
//    private int speed;

//    Transport(String brand, String model, String color, int year, String country, int speed) {
//        this.brand = chekParmetrs(brand);
//        this.color = chekParmetrs(color);
//
//        this.year = chekParmetrsDate(year);
//        this.model = chekParmetrs(model);
//
//        this.country = chekParmetrs(country);
//        this.speed = chekParmetrsSpeed(speed);
//    }

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

//    public int chekParmetrsSpeed(int parametr) {
//        if (parametr <= 0 || parametr >= 400) {
//            parametr = 50;
//        }
//        return parametr;
//    }

//    public int chekParmetrsDate(int parametr) {
//        if (parametr <= 0 || parametr > 2023) {
//            parametr = 2000;
//        }
//        return parametr;
//    }

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

    //
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
}
