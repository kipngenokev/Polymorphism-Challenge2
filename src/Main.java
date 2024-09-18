public class Main {
    public static void main(String[] args) {

        Car car =new Car("2022 Blue Ferrari GT3");
        runRace(car);

        Car ferrari= new GasPoweredCar("Porsche Macan 2020",20,6);
        runRace(ferrari);


    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();

        System.out.println("_________");
    }
}