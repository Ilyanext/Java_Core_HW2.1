package Transport;

public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final int year;
    private final String country;
    private final String bodeType;
    private boolean rubber;

    private final int numbersOfSeats;
    private String transmission;
    private int registrationNumber;
    private double engineVolume;

    private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, int registrationNumber, String bodeType, int numbersOfSeats, boolean rubber, Key key) {
        this.brand = brand;
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.model = model;
        if (model == null || model.isEmpty()) {
            model = " default";
        }
        setEngineVolume(this.engineVolume);
        this.color = color;
        if (color == null || color.isEmpty()) {
            color = " default";
        }

        this.year = year;
        if (year <= 0) {
            year = 2000;
        }
        this.country = country;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        setTransmission(this.transmission);
        setRegistrationNumber();
        if ((bodeType == null) || bodeType.isEmpty()) {
            bodeType = " default";
        }
        this.bodeType = bodeType;
        if (numbersOfSeats <= 0) {
            numbersOfSeats = 0;
        }
        this.numbersOfSeats = numbersOfSeats;
        this.rubber = rubber;
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

    public void chekRubber(int month) {

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
