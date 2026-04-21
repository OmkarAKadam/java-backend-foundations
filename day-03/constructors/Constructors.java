class Book{
    String title;
    String author;
    int year;

    public Book(){
        // Default constructor
    }

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void getTitle(){
        System.out.println("Title: " + title);
    }

    public void getAuthor(){
        System.out.println("Author: " + author);
    }

    public void getYear(){
        System.out.println("Year: " + year);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year){
        this.year = year;
    }   
}

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void getId(){
        System.out.println("ID: " + id);
    }

    public void getName(){
        System.out.println("Name: " + name);
    }

    public void getSalary(){
        System.out.println("Salary: $" + salary);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}

public class Constructors {
    
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Employee emp1 = new Employee(101, "Alice", 75000.0);

        System.out.println("Book: " + book1.title + " by " + book1.author + " (" + book1.year + ")");
        System.out.println("Employee: " + emp1.name + " (ID: " + emp1.id + ") with salary $" + emp1.salary);
    }
}