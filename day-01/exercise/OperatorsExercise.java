public class OperatorsExercise {
    public static void main(String[] args){
     
         // write code here
         int a = 20;
         int b = 10;
         
         int add = a + b;
         int sub = a - b;
         int mul = a * b;
         int div = a / b;
         
         boolean res = a > b;
         boolean res2 = a > b && b > 0;
         
         System.out.println("Addition: " + add);
         System.out.println("Subtraction: " + sub);
         System.out.println("Multiplication: " + mul);
         System.out.println("Division: " + div);
         
         System.out.println("Is a greater than b? " + res);
         System.out.println("Is a > b and b > 0? " + res2);
    }
}