public class SumOfAllElements {
    
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sum(numbers);
        System.out.println("The sum of all elements is: " + sum);
    }
}