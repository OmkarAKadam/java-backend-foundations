package com.app;


import com.app.accessmodifier.Employee;

public class AccessModifierDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alice", "alice@example.com", 25);

        // Accessing fields directly
        System.out.println("Public field (name): " + emp.name);   // allowed
        //System.out.println("Default field (email): " + emp.email); // Not-allowed (Different package)
        //System.out.println("Protected field (age): " + emp.age);   // Not-allowed (Different package)

        // System.out.println(emp.id); // ❌ Not allowed (private)

        // Accessing private field via getter
        System.out.println("Private field (id) via getter: " + emp.getId());
    }
}
