public class LoopsExercise {
    public static void main(String[] args) {
        // TODO: Print numbers 1 to 5 using for loop
        System.out.println("For Loop: ");
        for (int i = 1; i<= 5 ; i++){
            System.out.print(i + " ");
        } 

        // TODO: Print numbers 1 to 5 using while loop
        int j = 1;
        System.out.println("While Loop: ");
        while(j <= 5){
            System.out.print(j + " ");
            j++;
        }
        
        // TODO: Print numbers 1 to 5 using do-while loop
        int k = 1;
        System.out.println("Do-While Loop: ");
        do{
            System.out.print(k + " ");
            k++;
        }while(k<=5);
    }
}
