public class JaggedArray {
    public static void main(String[] args) {
        // Declare a jagged array: an array of arrays with varying lengths
        int[][] jaggedArray = new int[3][];
        
        // Initialize each sub-array with different lengths
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};
        
        // Print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}