interface vahiclestart {
    void start();
}
interface vahiclestop {
    void stop();
}

class Car implements vahiclestart, vahiclestop {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
       
}
