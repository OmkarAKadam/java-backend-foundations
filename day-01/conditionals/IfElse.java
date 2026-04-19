public class IfElse {
    public static void main(String[] args) {
        int number = 7;

        // if example
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else example
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // if-else if-else example
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive and nonzero.");
        }
    }
}