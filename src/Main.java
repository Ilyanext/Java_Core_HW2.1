import Transport.*;

public class Main {
    public static void main(String[] args) {

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

        System.out.println(" Водитель " + oleg.getFullName() + " управляет машиной " + carMers.getBrand() + " и будет участвовать в заезде.");
        System.out.println(" Водитель " + ura.getFullName() + " управляет машиной " + busRonol.getBrand() + " и будет участвовать в заезде.");
        System.out.println(" Водитель " + dim.getFullName() + " управляет машиной " + truckAudi.getBrand() + " и будет участвовать в заезде.");

        System.out.println(PassengerCars.Body.CROSSOVER.toString());
        System.out.println(Trucks.LoadCapacity.N1.toString());
        System.out.println(Bus.Places.BIG.toString());
        System.out.println();
        Transport.Type.printType("PASSENGERCARS");
        Transport.Type.printType("BUS");
        Transport.Type.printType("TRUCKS");
        Transport.Type.printType("");
        Transport.Type.printType("hgdfyh");


    }
}