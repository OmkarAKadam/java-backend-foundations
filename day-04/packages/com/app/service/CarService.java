package com.app.service;

import com.app.model.Car;

public class CarService {

    public void displayCarInfo(Car car) {
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
    }
}