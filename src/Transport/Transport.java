package Transport;

public class Transport {
    private String brand;
    private String model;
    private String color;
    private final int year;
    private final String country;
    private int speed;

    Transport(String brand, String model, String color, int year, String country) {
        this.brand = chekParmetrs(brand);
        this.color = chekParmetrs(color);

        this.year = chekParmetrsDate(year);
        this.model = chekParmetrs(model);

        this.country = chekParmetrs(country);
        this.speed = chekParmetrsSpeed(speed);
    }

    public String chekParmetrs(String parametr) {
        if (parametr == null || parametr.isEmpty()) {
            parametr = "default";
        }
        return parametr;
    }
    public int chekParmetrsSpeed (int parametr) {
        if (parametr <= 0 || parametr >=400) {
            parametr = 50;
        }
        return parametr;
    }
    public int chekParmetrsDate(int parametr) {
        if (parametr <= 0) {
            parametr = 2000;
        }
        return parametr;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }
}
