class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateBonus() {
        return salary * 0.05; 
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public double calculateBonus() {
        return getSalary() * 0.2; 
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public double calculateBonus() {
        return getSalary() * 0.1; 
    }
}

public class EmployeeInheritanceDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        Manager mgr = new Manager("Bob", 80000, "Sales");
        Developer dev = new Developer("Charlie", 60000, "Java");

        System.out.println(emp.getName() + "'s Bonus: $" + emp.calculateBonus());
        System.out.println(mgr.getName() + "'s Bonus: $" + mgr.calculateBonus());
        System.out.println(dev.getName() + "'s Bonus: $" + dev.calculateBonus());
    }
}