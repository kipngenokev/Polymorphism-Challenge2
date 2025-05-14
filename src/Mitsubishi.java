public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders,String name) {
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
