public class Demo {
    // Student class definition
    static class Student {
        // Instance variables (fields)
        String name;
        int age;
        String grade;
    }

    // Main method to demonstrate class and objects
    public static void main(String[] args) {
        // Creating objects (instances) of Student class
        Student student1 = new Student();
        Student student2 = new Student();

        // Setting values for student1
        student1.name = "Alice";
        student1.age = 20;
        student1.grade = "A";

        // Setting values for student2
        student2.name = "Bob";
        student2.age = 22;
        student2.grade = "B";

        // Displaying information of student1
        System.out.println("Student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Grade: " + student1.grade);

        // Displaying information of student2
        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("Grade: " + student2.grade);
    }
}