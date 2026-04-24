package day04.misc;

public class WrapperDemo {
    public static void main(String[] args) {
        // int → Integer
        int a = 10;
        Integer intObj = Integer.valueOf(a);
        Integer intAuto = a;
        int intUnbox = intAuto;

        // double → Double
        double d = 20.5;
        Double doubleObj = Double.valueOf(d);
        Double doubleAuto = d;
        double doubleUnbox = doubleAuto;

        // char → Character
        char ch = 'X';
        Character charObj = Character.valueOf(ch);
        Character charAuto = ch;
        char charUnbox = charAuto;

        // boolean → Boolean
        boolean flag = true;
        Boolean boolObj = Boolean.valueOf(flag);
        Boolean boolAuto = flag;
        boolean boolUnbox = boolAuto;

        // String conversions
        String strInt = Integer.toString(a);
        String strDouble = Double.toString(d);
        int parsedInt = Integer.parseInt("100");
        double parsedDouble = Double.parseDouble("99.99");

        System.out.println("Integer: " + intObj + ", " + intAuto + ", " + intUnbox);
        System.out.println("Double: " + doubleObj + ", " + doubleAuto + ", " + doubleUnbox);
        System.out.println("Character: " + charObj + ", " + charAuto + ", " + charUnbox);
        System.out.println("Boolean: " + boolObj + ", " + boolAuto + ", " + boolUnbox);
        System.out.println("String conversions: " + strInt + ", " + strDouble);
        System.out.println("Parsed values: " + parsedInt + ", " + parsedDouble);
    }
}
