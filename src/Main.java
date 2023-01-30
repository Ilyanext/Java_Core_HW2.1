public class Main {
    public static void main(String[] args) {
        // task1-2-3
        Car ladaGranta = new Car(" Lada ", " Granta ", 1.7, " yellow ", 2015, " Россия ");
        Car audi = new Car(" Audi ", " A8 50L TDL quattro ", 3.0, " black ", 2020, " Германия ");
        Car bmw = new Car(" BMW ", " Z8 ", 3.0, " black ", 2021, " Германия ");
        Car kia = new Car(" Kia ", " Sportage 4 ", 2.4, " red ", 2018, " Южная Корея ");
        Car hyundai = new Car(" Hyundai ", " Avante ", 1.6, " red ", 2016, " Южная Корея ");

        ladaGranta.print();
        audi.print();
        bmw.print();
        kia.print();
        hyundai.print();
    }
}