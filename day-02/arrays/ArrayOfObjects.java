public class ArrayOfObjects {
    public static void main(String[] args) {
        // Define a simple Person class
        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            void display() {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        }

        // Create an array of Person objects
        Person[] people = new Person[3];

        // Initialize the array elements
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 35);

        // Iterate and display each object
        for (Person person : people) {
            person.display();
        }
    }
}