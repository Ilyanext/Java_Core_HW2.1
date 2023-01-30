public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String b, String m, double e, String c, int y, String coun) {
        this.brand = b;
        if (brand == null || brand == "") {
            brand = "default";
        }
        this.model = m;
        if (model == null || model == "") {
            model = " default";
        }
        this.engineVolume = e;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.color = c;
        if (color == null || color == "") {
            color = "white";
        }
        this.year = y;
        if (year <= 0) {
            year = 2000;
        }
        this.country = coun;
        if (country == null || country == "") {
            country = "default";
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void print() {
        System.out.println("Марка автомобиля:  " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + "л, цвет кузова: " + color + ", год выпуска: " + year + ", произведен в стране:  " + country);
    }

}
