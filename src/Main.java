import Transport.*;

public class Main {
    public static void main(String[] args) {
        // task1-2-3
//        Car ladaGranta = new Car(" Lada ", " Granta ", 1.7, " yellow ", 2015, " Россия " ,"автомат",356,"hachback",5,true,new Car.Key(true,false), 180);
//        Car audi = new Car(" Audi ", " A8 50L TDL quattro ", 3.0, " black ", 2020, " Германия ","механика",375,"rhachback",5,true,new Car.Key(true,true),210);
//        Car bmw = new Car(" BMW ", " Z8 ", 3.0, " black ", 2021, " Германия ","автомат",6666,"hachback",5,true,new Car.Key(true,false),222 );
//        Car kia = new Car(" Kia ", " Sportage 4 ", 2.4, " red ", 2018, " Южная Корея " ,"автомат",434,"hachback",5,true,new Car.Key(false,true),0);
//        Car hyundai = new Car(" Hyundai ", " Avante ", 1.6, " red ", 2016, " Южная Корея " ,"механика",343,"hachback",5,false,new Car.Key(false,false),1000);
//        Car hyundai1 = new Car(" Hyundai ", " Avante ", 1.6, " red ", 2016, " Южная Корея ", "автомат", 333, "hachback", 55, false,new Car.Key(true,false),-12 );
//        Bus bus1 = new Bus("Mersedes", "D-32", "white", 2015, "Russia", 180 );
//        Bus bus2 = new Bus("Mersedes", "A-2", "black", 1999, "", 1000 );
//        Bus bus3 = new Bus("Mersedes", "F-342", "green", 2025, "", 180 );


//        ladaGranta.print();
//        audi.print();
//        bmw.print();
//        kia.print();
//        hyundai.print();
//        hyundai1.print();
//        hyundai1.chekRubber();
//        hyundai.chekRubber();
//        bus1.print();
//        bus2.print();
//        bus3.print();
        Bus <DriverB>  busMers = new Bus("Mers", "D-31", 2.1);
        Bus busAudi = new Bus("Audi", "f-31", 1.1);
        Bus busRonol = new Bus("Ronol", "A-331", 3);
        Bus busMex = new Bus("Mex", "dr-3671", 5.9);

        PassengerCars carMers = new PassengerCars("Mers", "yu-43", 1.1);
        PassengerCars carAudi = new PassengerCars("Audi", "tt-1", 1);
        PassengerCars carRonol = new PassengerCars("Ronol", "rA-67", 6);
        PassengerCars carMex = new PassengerCars("Mex", "dr-3", 4.4);

        Trucks truckMers = new Trucks("Mers", "456s", 4.3);
        Trucks truckAudi = new Trucks("Audi", "444l", 0.9);
        Trucks truckRonol = new Trucks("Ronol", "787yu", 2.7);
        Trucks truckMex = new Trucks("Mex", "33h", 3.4);

        busMers.print();
        busAudi.print();
        busRonol.print();
        busMex.print();
        System.out.println();

        carMers.print();
        carAudi.print();
        carRonol.print();
        carMex.print();
        System.out.println();

        truckMers.print();
        truckAudi.print();
        truckRonol.print();
        truckMex.print();
        System.out.println();

        DriverB oleg = new DriverB("Oleg Pahov", true, 20);
        DriverB ura = new DriverB("Ura Pahov", false, 10);
        DriverB dim = new DriverB("Dim Pahov", true, -1);
        oleg.print();
        ura.print();
        dim.print();


    }
}