
class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    double calculateFuelEfficiency() {
        return 0;
    }

    double calculateDistance() {
        return 0;
    }

    double calculateMaxSpeed() {
        return 0;
    }
}

class Truck extends Vehicle {
    Truck() {
        super("Tata", "407", 2022, "Diesel");
    }

    @Override
    double calculateFuelEfficiency() {
        return 8.5;
    }

    @Override
    double calculateDistance() {
        return 15000;
    }

    @Override
    double calculateMaxSpeed() {
        return 120;
    }
}

class Car extends Vehicle {
    Car() {
        super("Maruti", "Swift", 2023, "Petrol");
    }

    @Override
    double calculateFuelEfficiency() {
        return 18.0;
    }

    @Override
    double calculateDistance() {
        return 8000;
    }

    @Override
    double calculateMaxSpeed() {
        return 160;
    }
}

class Motorcycle extends Vehicle {
    Motorcycle() {
        super("Royal Enfield", "Classic 350", 2021, "Petrol");
    }

    @Override
    double calculateFuelEfficiency() {
        return 30.0;
    }

    @Override
    double calculateDistance() {
        return 5000;
    }

    @Override
    double calculateMaxSpeed() {
        return 110;
    }
}

public class Ass9Q5 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Truck(),
            new Car(),
            new Motorcycle()
        };

        for (Vehicle v : vehicles) {
            System.out.println(
                v.year + " " + v.make + " " + v.model
                + " (" + v.fuelType + ")"
            );

            System.out.println(
                "Fuel Efficiency: "
                + v.calculateFuelEfficiency() + " km/l"
            );

            System.out.println(
                "Distance: " + v.calculateDistance() + " km"
            );

            System.out.println(
                "Max Speed: " + v.calculateMaxSpeed() + " km/h"
            );

            System.out.println();
        }
    }
}
