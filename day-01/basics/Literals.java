public class Literals {
    public static void main(String[] args) {
        // Integer literals
        int decimal = 42;
        int octal = 052; // Octal (starts with 0)
        int hex = 0x2A; // Hexadecimal (starts with 0x)
        int binary = 0b101010; // Binary (starts with 0b)

        // Floating-point literals
        double pi = 3.14159;
        float e = 2.718f; // Float literal with 'f' suffix
        double scientific = 1.23e4; // Scientific notation

        // Character literals
        char letter = 'A';
        char unicode = '\u0041'; // Unicode escape
        char escape = '\n'; // Escape sequence

        // String literals
        String greeting = "Hello, World!";
        String multiline = """
                          This is a
                          text block
                          in Java 13+.
                          """;

        // Boolean literals
        boolean isTrue = true;
        boolean isFalse = false;

        // Null literal
        String nullValue = null;

        // Printing examples
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hex: " + hex);
        System.out.println("Binary: " + binary);
        System.out.println("Pi: " + pi);
        System.out.println("E: " + e);
        System.out.println("Scientific: " + scientific);
        System.out.println("Letter: " + letter);
        System.out.println("Unicode: " + unicode);
        System.out.println("Escape (newline): " + escape + "End");
        System.out.println("Greeting: " + greeting);
        System.out.println("Multiline: " + multiline);
        System.out.println("True: " + isTrue);
        System.out.println("False: " + isFalse);
        System.out.println("Null: " + nullValue);
    }
}