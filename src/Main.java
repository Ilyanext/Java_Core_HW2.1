import Transport.*;

public class Main {
    public static void main(String[] args) {
//         task1-2-3
//        Car ladaGranta = new Car(" Lada ", " Granta ", 1.7, " yellow ", 2015, " Россия " ,"автомат",356,"hachback",5,true,new Car.Key(true,false), 180);
//        Car audi = new Car(" Audi ", " A8 50L TDL quattro ", 3.0, " black ", 2020, " Германия ","механика",375,"rhachback",5,true,new Car.Key(true,true),210);
//        Car bmw = new Car(" BMW ", " Z8 ", 3.0, " black ", 2021, " Германия ","автомат",6666,"hachback",5,true,new Car.Key(true,false),222 );
//        Car kia = new Car(" Kia ", " Sportage 4 ", 2.4, " red ", 2018, " Южная Корея " ,"автомат",434,"hachback",5,true,new Car.Key(false,true),0);
//        Car hyundai = new Car(" Hyundai ", " Avante ", 1.6, " red ", 2016, " Южная Корея " ,"механика",343,"hachback",5,false,new Car.Key(false,false),1000);
//        Car hyundai1 = new Car(" Hyundai ", " Avante ", 1.6, " red ", 2016, " Южная Корея ", "автомат", 333, "hachback", 55, false,new Car.Key(true,false),-12 );
//        Bus bus1 = new Bus("Mersedes", "D-32", "white", 2015, "Russia", 180 );
//        Bus bus2 = new Bus("Mersedes", "A-2", "black", 1999, "", 1000 );
//        Bus bus3 = new Bus("Mersedes", "F-342", "green", 2025, "", 180 );
//
//
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
        DriverB oleg = new DriverB("Oleg Pahov", true, 20);
        DriverC ura = new DriverC("Ura Pahov", false, 10);
        DriverD dim = new DriverD("Dim Pahov", true, -1);

        Bus busMers = new Bus("Mers", "D-31", 2.1, ura);
        Bus busAudi = new Bus("Audi", "f-31", 1.1, ura);
        Bus busRonol = new Bus("Ronol", "A-331", 3, ura);
        Bus busMex = new Bus("Mex", "dr-3671", 5.9, ura);

        PassengerCars carMers = new PassengerCars("Mers", "yu-43", 1.1, oleg);
        PassengerCars carAudi = new PassengerCars("Audi", "tt-1", 1, oleg);
        PassengerCars carRonol = new PassengerCars("Ronol", "rA-67", 6, oleg);
        PassengerCars carMex = new PassengerCars("Mex", "dr-3", 4.4, oleg);

        Trucks truckMers = new Trucks("Mers", "456s", 4.3, dim);
        Trucks truckAudi = new Trucks("Audi", "444l", 0.9, dim);
        Trucks truckRonol = new Trucks("Ronol", "787yu", 2.7, dim);
        Trucks truckMex = new Trucks("Mex", "33h", 3.4, dim);

//        busMers.print();
//        busAudi.print();
//        busRonol.print();
//        busMex.print();
//        System.out.println();

//        carMers.print();
//        carAudi.print();
//        carRonol.print();
//        carMex.print();
//        System.out.println();
//
//        truckMers.print();
//        truckAudi.print();
//        truckRonol.print();
//        truckMex.print();
//        System.out.println();


//        oleg.print();
//        ura.print();
//        dim.print();
        System.out.println(" Водитель " + oleg.getFullName() + " управляет машиной " + carMers.getBrand() + " и будет участвовать в заезде.");
        System.out.println(" Водитель " + ura.getFullName() + " управляет машиной " + busRonol.getBrand() + " и будет участвовать в заезде.");
        System.out.println(" Водитель " + dim.getFullName() + " управляет машиной " + truckAudi.getBrand() + " и будет участвовать в заезде.");
//        for (int i = 1; i <= 4; i++) {
//            DriverB driverB = new DriverB("Driver cat.B# " + i, true, 5 + i);
//            PassengerCars passengerCarsB = new PassengerCars("Car # " + i, "Car model #" + i, 1.2, driverB);
//
//            DriverC driverC = new DriverC("Driver cat.C# " + i, false, 6 + i);
//            Bus bus = new Bus("Bus # " + i, "Car model #" + i, 3.3, driverC);
//
//            DriverD driverD = new DriverD("Driver cat.D# " + i, true, 10 + i);
//            Trucks trucks = new Trucks("Truk # " + i, "Car model #" + i, 4.7, driverD);
//
//            printInfo(passengerCarsB);
//            printInfo(bus);
//            printInfo(trucks);
//            System.out.println();
//        }
//
//
//    }
//
//    private static void printInfo(Transport<?> transport) {
//        System.out.println(" Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
//    }
    }
}