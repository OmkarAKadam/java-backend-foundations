package Operators;

public class ArithematicOperators {
    public static void main(String[] args) {
        // Arithmetic operators: +, -, *, /, %
        int a = 10;
        int b = 3;
        System.out.println("Addition: " + (a + b)); // 13
        System.out.println("Subtraction: " + (a - b)); // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b)); // 3 (integer division)
        System.out.println("Modulus: " + (a % b)); // 1

        // Assignment operators: +=, -=, *=, /=, %=
        int x = 5;
        x += 2; // x = x + 2; x is now 7
        System.out.println("After +=: " + x);
        x -= 3; // x = x - 3; x is now 4
        System.out.println("After -=: " + x);
        x *= 2; // x = x * 2; x is now 8
        System.out.println("After *=: " + x);
        x /= 4; // x = x / 4; x is now 2
        System.out.println("After /=: " + x);
        x %= 2; // x = x % 2; x is now 0
        System.out.println("After %=: " + x);

        // Increment and decrement operators: ++, --
        int y = 5;
        System.out.println("Pre-increment: " + (++y)); // y is now 6, prints 6
        System.out.println("Post-increment: " + (y++)); // prints 6, then y is 7
        System.out.println("Current y: " + y); // 7
        System.out.println("Pre-decrement: " + (--y)); // y is now 6, prints 6
        System.out.println("Post-decrement: " + (y--)); // prints 6, then y is 5
        System.out.println("Current y: " + y); // 5
    }
}