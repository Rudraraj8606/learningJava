public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> start engine");
    }
    public void drive(){
        System.out.println("car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine(){
        System.out.println("car -> engine running");
    }
}
