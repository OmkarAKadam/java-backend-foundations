public class ConditionalStatementsExercise {
   public static void main(String[] args) {
       
        int score = 75;
        char grade = 'B';
        
        // TODO: Check pass or fail

        // TODO: Determine grade based on score
        
        if (score >= 50 && score <= 60){
            System.out.println("Passed");
            System.out.println("Grade: D");
        }else if (score >= 60 && score <= 74){
            System.out.println("Passed");
            System.out.println("Grade: C");
        }else if (score >= 75 && score <= 89){
            System.out.println("Passed");
            System.out.println("Grade: B");
        }else if (score >= 90){
            System.out.println("Passed");
            System.out.println("Grade: A");
        }else{
            System.out.println("Failed");
            
        }
   }
}