// the code inspiration and code idea and overall code is adapted from Tim Buchalka's class
// YouTube channel: https://www.youtube.com/@TheLearnProgrammingChannel

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("2022 blue ferrari 296 GTS");
//        runRace(car);

        // example of Polymorphism
        Car ferrari = new GasPoweredCar("2022 blue ferrari 296 GTS", 15.4,6);
        runRace(ferrari);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
        car.runEngine();
    }
}
