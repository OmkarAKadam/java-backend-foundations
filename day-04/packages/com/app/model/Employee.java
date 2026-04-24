package com.app.model;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String leaveApplication;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setLeaveApplication(String leaveApplication) {
        this.leaveApplication = leaveApplication;
    }

    public String getLeaveApplication() {
        return "Employee: " + getName() + " with id: " + getId() + " and email: " + getEmail()
                + " has Applied for Leave, Here's the Application:  " + leaveApplication;
    }
}
