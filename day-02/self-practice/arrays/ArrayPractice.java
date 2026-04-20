public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {45, 22, 89, 16, 90, 33, 22};
        
        //1. Second Largest Element
        System.out.println("1. Second Largest Element");
        int secMax, max;
        secMax = max = nums[0];

        for(int m : nums){
            if(max < m){
                secMax = max;
                max = m;                
            } else if(secMax < m && m != max){
                secMax = m;
            }
        }

        
        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + secMax);

        //2. Reverse Array
        System.out.println();
        System.out.println("2. Reverse Array");
        int[] nums2 = {45, 22, 89, 16, 90, 33};

        for(int i = 0; i < nums2.length / 2; i++){
            int temp = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array: ");
        for(int n : nums2){
            System.out.print(n + " ");
        }

        //3. Check if Array is Sorted
        System.out.println();
        System.out.println();
        System.out.println("3. Check if Array is Sorted");

        boolean isSorted = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        //4. Find Duplicate Elements
        System.out.println();
        System.out.println();
        System.out.println("4. Find Duplicate Elements");
        int[] dups = new int[nums.length];
        
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    dups[i] = nums[i];
                }
            }
        }

        System.out.println("Duplicate Elements: ");
        for(int n : dups){
            if(n != 0){
                System.out.print(n + " ");
            }
        }

        //5. Rotate Array Right by 1
        System.out.println();
        System.out.println();
        System.out.println("5. Rotate Array Right by 1");
        int[] nums3 = {45, 22, 89, 16, 90, 33};

        int last = nums3[nums3.length - 1];

        for(int i = nums3.length - 1; i > 0; i--){
            nums3[i] = nums3[i - 1];
        }
        nums3[0] = last;

        System.out.println("Rotated Right by 1: ");
        for(int n : nums3){
            System.out.print(n + " ");
        }
    }
}
