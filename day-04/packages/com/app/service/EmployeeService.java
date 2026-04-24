package com.app.service;
import com.app.model.Employee;

import java.util.Scanner;

public class EmployeeService {

    public void ApplyLeaveApplication(Employee employee, String leaveApplication) {
        employee.setLeaveApplication(leaveApplication);
    }

    public void displayLeaveApplication(Employee employee) {
        System.out.println(employee.getLeaveApplication());
    }
}
