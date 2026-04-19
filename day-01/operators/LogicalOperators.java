package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&): true if both are true
        System.out.println("a && b: " + (a && b)); // false

        // Logical OR (||): true if at least one is true
        System.out.println("a || b: " + (a || b)); // true

        // Logical NOT (!): negates the value
        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true
    }
}