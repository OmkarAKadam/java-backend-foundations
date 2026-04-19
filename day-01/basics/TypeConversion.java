public class TypeConversion {
    public static void main(String[] args) {
        // Widening conversion (automatic)
        int intValue = 42;
        double doubleValue = intValue; // int -> double
        System.out.println("int to double: " + doubleValue);

        // Narrowing conversion (requires cast)
        double pi = 3.14159;
        int intPi = (int) pi; // double -> int
        System.out.println("double to int: " + intPi);

        // String to primitive
        String numberText = "123";
        int parsedNumber = Integer.parseInt(numberText);
        System.out.println("String to int: " + parsedNumber);

        // Primitive to String
        String textValue = String.valueOf(intValue);
        System.out.println("int to String: " + textValue);
    }
}