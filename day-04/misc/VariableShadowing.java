class Parent {
    int x = 10;

    void display() {
        System.out.println("Parent x: " + x);
    }
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Child x: " + x); 
        System.out.println("Parent x from Child: " + super.x); 
    }
}

public class VariableShadowing {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}