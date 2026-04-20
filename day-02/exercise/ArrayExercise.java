public class Exercise {
    public static void main(String[] args) {
        
        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
        int[] numbers = {45, 22, 89, 16, 90, 33};
        
        // TODO: Initialize min and max with the first element
        int min, max;
        min = max = numbers[0];
        
        // TODO: Use an enhanced for loop to find min and max
        for(int n : numbers){
            for(int m: numbers){
                if(max < m){
                    max = m;
                }
                
                if(n < min){
                    min = n;
                }
            }   
        }

        // TODO: Print the smallest and largest numbers
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
