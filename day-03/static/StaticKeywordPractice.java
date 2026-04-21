class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }
}

class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class StaticKeywordPractice {
    
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("Before: " + Counter.count);
        Counter c4 = new Counter();
        System.out.println("After: " + Counter.count);
        System.out.println("Count: " + Counter.count);

        int sum = MathUtils.add(5, 3);
        int difference = MathUtils.subtract(5, 3);
        int product = MathUtils.multiply(5, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);    
        System.out.println("Product: " + product);
    }
}