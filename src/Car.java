public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders,String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;

    }

    public String startEngine() {
        return("Car engine starting "+ getClass().getSimpleName() + " starting");
    }

    public String accelerate() {
        return("Car accelerating" +getClass().getSimpleName() + " accelerating");
    }

    public String brake() {
        return("Car braking" +getClass().getSimpleName() + " braking");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
