package Transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private final String bodeType;
    private int registrationNumber;
    private final int numbersOfSeats;
    private boolean rubber = true;
    private Key key;

    public Car(String Brand, String Model, double EngineVolume, String Color, int Year, String Country, String Transmission, int RegistrationNumber, String bodeType, int numbersOfSeats, boolean Rubber, Key key) {
        this.brand = Brand;
        if (Brand == null || Brand.isEmpty()) {
            Brand = "default";
        }
        this.model = Model;
        if (Model == null || Model.isEmpty()) {
            Model = " default";
        }
        setEngineVolume(engineVolume);
        setColor(color);
        this.year = Year;
        if (Year <= 0) {
            Year = 2000;
        }
        this.country = Country;
        if (Country == null || Country.isEmpty()) {
            Country = "default";
        }
        setTransmission(transmission);
        setRegistrationNumber();
        if ((bodeType == null) || bodeType.isEmpty()) {
            bodeType = " default";
        }
        this.bodeType = bodeType;
        if (numbersOfSeats <= 0) {
            numbersOfSeats = 0;
        }
        this.numbersOfSeats = numbersOfSeats;
        this.rubber = Rubber;
        setKey(key);

    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

    }

    public void chekRubber() {
        int month = 2;
        switch (month) {
            case 1:
            case 2:
            case 12:
                if (getRubber() == !true) {
                    System.out.println(" Смени шины на сезонные! ");
                }
                break;
            case 6:
            case 7:
            case 8:
                if (getRubber() == !false) {
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


    public int getRegistrationNumber() {
        return registrationNumber;
    }


    public boolean getRubber() {
        return rubber;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "white";
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "default";
        }
        this.transmission = transmission;
    }

    public void setRegistrationNumber() {
        if (registrationNumber <= 0) {
            registrationNumber = 2000;
        }
        this.registrationNumber = registrationNumber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    public String getBodeType() {
        return bodeType;
    }

    public int getNumbersOfSeats() {
        return numbersOfSeats;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void print() {
        System.out.println("Марка автомобиля:  " + getBrand() + ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + "л, цвет кузова: " + getColor() +
                ", год выпуска: " + getYear() + ", произведен в стране:  " + getCountry() +
                ", коробка передач: " + getTransmission() + ", тип кузова: " + getBodeType() +
                ", регистрационный номер: " + getRegistrationNumber() +
                ", количество мест: " + getNumbersOfSeats() +
                ", шины:" + (rubber ? " зимняя" : " летняя") + " резина, " + (key.remoteEngineStart ? " удаленный запуск двигателя" : " не удаленный запуск двигателя") + ", " + (key.keylessAccess ? " безключевой доступ " : " клуючевой доступ "));
    }


}
