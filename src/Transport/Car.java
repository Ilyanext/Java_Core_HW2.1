package Transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private String bodeType;
    private int registrationNumber;
    private int numbersOfSeats;
    private static boolean rubber = true;
    public static int month = 2;

    public Car(String Brand, String Model, double EngineVolume, String Color, int Year, String Country) {
        this.brand = Brand;
        if (Brand == null || Brand.isEmpty()) {
            Brand = "default";
        }
        this.model = Model;
        if (Model == null || Model.isEmpty()) {
            Model = " default";
        }
        this.engineVolume = EngineVolume;
        if (EngineVolume <= 0) {
            EngineVolume = 1.5;
        }
        this.color = Color;
        if (Color == null || Color.isEmpty()) {
            Color = "white";
        }
        this.year = Year;
        if (Year <= 0) {
            Year = 2000;
        }
        this.country = Country;
        if (Country == null || Country.isEmpty()) {
            Country = "default";
        }
    }


    public Car(String Brand, String Model, double EngineVolume, String Color, int Year, String Country, String Transmission, int RegistrationNumber, String BodeType, int NumbersOfSeats, boolean Rubber) {
        this.brand = Brand;
        if (Brand == null || Brand.isEmpty()) {
            Brand = "default";
        }
        this.model = Model;
        if (Model == null || Model.isEmpty()) {
            Model = " default";
        }
        this.engineVolume = EngineVolume;
        if (EngineVolume <= 0) {
            EngineVolume = 1.5;
        }
        this.color = Color;
        if (Color == null || Color.isEmpty()) {
            Color = "white";
        }
        this.year = Year;
        if (Year <= 0) {
            Year = 2000;
        }
        this.country = Country;
        if (Country == null || Country.isEmpty()) {
            Country = "default";
        }
        this.transmission = Transmission;
        if (transmission == null || transmission.isEmpty()) {
            transmission = "default";
        }
        this.registrationNumber = RegistrationNumber;
        this.bodeType = BodeType;
        if (BodeType == null || BodeType.isEmpty()) {
            BodeType = "default";
        }
        this.numbersOfSeats = NumbersOfSeats;
        this.rubber = Rubber;
        chekRubber(month);
    }


    public static void chekRubber(int month) {
        switch (month) {
            case 1:
            case 2:
            case 12:
                if (rubber = !true) {
                    System.out.println(" Смени шины на сезонные! ");
                }
                break;
            case 6:
            case 7:
            case 8:
                if (rubber = !false) {
                    System.out.println(" Смени шины на сезонные! ");
                }
                break;
            default:
                break;

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

    public String getTransmission() {
        return transmission;
    }

    public String getBodeType() {
        return bodeType;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumbersOfSeats() {
        return numbersOfSeats;
    }

    public static boolean getRubber() {
        return rubber;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    public void print() {
        System.out.println("Марка автомобиля:  " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngineVolume() + "л, цвет кузова: " + getColor() + ", год выпуска: " + getYear() + ", произведен в стране:  " + getCountry() + ", коробка передач: " + getTransmission() + ", тип кузова: " + getBodeType() + ", регистрационный номер: " + getRegistrationNumber() + ", количество мест: " + getNumbersOfSeats() + ", зимние(true) / летние(false) шины:" + rubber);
    }


}
