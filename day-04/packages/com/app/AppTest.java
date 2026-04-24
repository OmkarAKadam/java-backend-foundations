package com.app;

import com.app.model.*;
import com.app.service.*;

public class AppTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Supra", 2018);

        Employee emp = new Employee(1, "Omkar Kadam", "omkarkadam@gmail.com");
        String leaveApplication = "Hi, i need Vacation from this to this date!!";

        CarService carService = new CarService();
        carService.displayCarInfo(car);

        EmployeeService employeeService = new EmployeeService();
        employeeService.ApplyLeaveApplication(emp, leaveApplication);

        employeeService.displayLeaveApplication(emp);
    }
}