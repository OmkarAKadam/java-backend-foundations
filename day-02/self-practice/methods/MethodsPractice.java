public class MethodsPractice {

    //Prime Number Checker
    public boolean isPrime(int n){
        boolean isPrime = true;

        if(n <= 1){
            isPrime = false;
        } 
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    //Factorial using Method
    public int factorial(int n){
        int fact = 1;

        if(n < 0){
            return -1;
        } 
        else if(n == 0){
            return 1;
        } 
        else{
            for(int i = n; i > 0; i--){
                fact *= i;
            }
            return fact;
        }
    }

    public int fibonacci(int n){
        int fibonacciSeries[] = new int[n + 1];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        if(n < 0){
            return -1;
        } 
        else if(n == 0){
            return 0;
        } 
        else if(n == 1){
            return 1;
        } 
        else{
            for(int i = 2; i <= n; i++){
                fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i -2];
            }
            return fibonacciSeries[n];
        }
    }

    //Method to Find Max in Array
    public int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MethodsPractice mp = new MethodsPractice();

        System.out.println(mp.isPrime(7));
        System.out.println(mp.factorial(5));
        System.out.println(mp.fibonacci(10));
        System.out.println(mp.findMax(new int[]{1, 5, 3, 9, 2}));
    }
}