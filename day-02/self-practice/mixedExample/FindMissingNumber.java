public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int n = numbers.length + 1;
        int missingNumber = 0;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }
        missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);
    }
}