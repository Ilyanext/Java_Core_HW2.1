import Transport.Car;

public class Main {
    public static void main(String[] args) {
        // task1-2-3
        Car ladaGranta = new Car(" Lada ", " Granta ", 1.7, " yellow ", 2015, " Россия " ,"mex",33,"ril",5,true,new Car.Key(true,false));
        Car audi = new Car(" Audi ", " A8 50L TDL quattro ", 3.0, " black ", 2020, " Германия ","mex",33,"ril",5,true,new Car.Key(true,true));
        Car bmw = new Car(" BMW ", " Z8 ", 3.0, " black ", 2021, " Германия ","mex",33,"ril",5,true,new Car.Key(true,false) );
        Car kia = new Car(" Kia ", " Sportage 4 ", 2.4, " red ", 2018, " Южная Корея " ,"mex",33,"ral",5,true,new Car.Key(false,true));
        Car hyundai = new Car(" Hyundai ", " Avante ", 1.6, " red ", 2016, " Южная Корея " ,"mex",33,"ail",5,false,new Car.Key(false,false));
        Car hyundai1 = new Car(" Hyundai ", " Avante ", 1.6, " red ", 2016, " Южная Корея ", "tru", 33, "krol", 55, false,new Car.Key(true,true) );

        ladaGranta.print();
        audi.print();
        bmw.print();
        kia.print();
        hyundai.print();
        hyundai1.print();
        hyundai1.chekRubber();
        hyundai.chekRubber();



    }
}