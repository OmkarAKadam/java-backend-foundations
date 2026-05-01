import java.util.Scanner;


public class QuizConsoleApp{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        QuizService quizService = new QuizService();
        String result = quizService.displayQuestions(scanner);

        System.out.println(result);
    }
}