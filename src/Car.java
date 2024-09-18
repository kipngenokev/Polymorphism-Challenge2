public class Car {
    private String description;

    public Car(String description){
        this.description= description;
    }

    public void startEngine(){
        System.out.println("Engine starting");
    }

    public void drive(){
        System.out.println("Car being driven, type of car is "+getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Engine running");
    }

}

class GasPoweredCar extends Car{
    private double avgkmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgkmPerLitre, int cylinders) {
        super(description);
        this.avgkmPerLitre = avgkmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas->All %d cylinders fired up fully,Ready!%n",cylinders);
    }

 //   @Override
//    public void drive() {
//        super.drive();
//    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas-> usage exceeds the average : %.2f%n",avgkmPerLitre);
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int charge;

    public ElectricCar(String description, double avgKmPerCharge, int charge) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.charge = charge;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}

class HyBridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HyBridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}


