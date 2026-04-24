class Vehicle {
    private String brand;
    private double speed;

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private String fuelType;

    public Car(String brand, double speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed() + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String brand, double speed, String fuelType, double batteryCapacity) {
        super(brand, speed, fuelType);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed() + " km/h");
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class VehicleInheritanceDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Vehicle", 100);
        Car car = new Car("Toyota", 150, "Gasoline");
        ElectricCar electricCar = new ElectricCar("Tesla", 200, "Electric", 75);

        System.out.println("Vehicle Information:");
        vehicle.displayInfo();
        System.out.println();

        System.out.println("Car Information:");
        car.displayInfo();
        System.out.println();

        System.out.println("Electric Car Information:");
        electricCar.displayInfo();
    }
}