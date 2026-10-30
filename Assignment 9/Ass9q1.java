class Vehicle {
    void drive() {
        System.out.println("Driving a Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a Car");
    }
}

public class ASS9Q1 {
    public static void main(String[] args) {
        Vehicle V1 = new Vehicle();
        Car C1 = new Car();

        V1.drive();
        C1.drive();
    }
}