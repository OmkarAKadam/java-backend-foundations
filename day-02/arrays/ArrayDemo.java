public class ArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Access and print elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[4]);
        
        // Loop through the array
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // Modify an element
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);
    }
}