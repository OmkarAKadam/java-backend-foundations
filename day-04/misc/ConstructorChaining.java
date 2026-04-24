class A {
    A() {
        System.out.println("A's constructor");
    }

    A(int x) {
        this();
        System.out.println("A's parameterized constructor with value: " + x);
    }
}

class B extends A {
    B() {
        System.out.println("B's constructor");
    }

    B(int x) {
        super(x);
        System.out.println("B's parameterized constructor with value: " + x);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
    System.out.println("Calling A & B's Default constructors only");
    B b1 = new B();
    
    System.out.println("Calling A's Default constructors with A & B's Parameterrized constructors");
    B b2 = new B(10);
}
}

