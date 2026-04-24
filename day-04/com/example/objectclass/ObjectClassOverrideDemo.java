package day04.com.example.objectclass;

import java.util.Objects;

class Student {
    private int id;
    private String name;
    private String email;
    private String department;

    public Student(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(department, student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, department);
    }
}

public class ObjectClassOverrideDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "alice@example.com", "CS");
        Student s2 = new Student(102, "Bob", "bob@example.com", "IT");
        Student s3 = new Student(101, "Alice", "alice@example.com", "CS");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("s1 equals s2? " + s1.equals(s2));
        System.out.println("s1 equals s3? " + s1.equals(s3));

        System.out.println("HashCode of s1: " + s1.hashCode());
        System.out.println("HashCode of s2: " + s2.hashCode());
        System.out.println("HashCode of s3: " + s3.hashCode());

        System.out.println("s1 and s3 have same hashCode? " + (s1.hashCode() == s3.hashCode()));
    }
}
