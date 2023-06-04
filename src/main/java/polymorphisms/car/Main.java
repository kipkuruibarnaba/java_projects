package polymorphisms.car;

public class Main {
    public static void main(String[] args) {
       Car car = new Car("2016 Subaru Forester");
       runRace(car);
        System.out.println("\n");
        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296  GTS ",15.4,6);
        runRace(ferrari);

        System.out.println("\n");
        Car tesla = new ElectricCar("2022 Red Tesla Model 3 ",568,75);
        runRace(tesla);

        System.out.println("\n");
        Car ferrahiHybrid = new HybridCar("2022 Black Ferrari Model 3 ",16,8,8);
        runRace(ferrahiHybrid);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
