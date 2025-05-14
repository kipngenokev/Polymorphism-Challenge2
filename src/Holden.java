public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);

    }

    @Override
    public String startEngine() {
        return(getClass().getSimpleName() + " starting");
    }

    @Override
    public String accelerate() {
        return(getClass().getSimpleName() + " accelerating");
    }

    @Override
    public String brake() {
        return(getClass().getSimpleName() + " breaking");
    }
}
