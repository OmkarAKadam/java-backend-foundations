package day04.misc;

class Vehicle {
    private String brand;
    private String color;

    Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}

class Car extends Vehicle {
    private String model;
    private int year;

    Car(String brand, String color, String model, int year) {
        super(brand, color);
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

public class UpcastingDowncastingDemo {
    public static void main(String[] args) {
        Vehicle v = new Car("Toyota", "Red", "Corolla", 2022);

        // upcasting
        System.out.println("Brand: " + v.getBrand());
        System.out.println("Color: " + v.getColor());

        Car c = (Car) v; // downcasting
        System.out.println("Model: " + c.getModel());
        System.out.println("Year: " + c.getYear());
    }
}
