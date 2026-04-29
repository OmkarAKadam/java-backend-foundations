import java.util.Scanner;

class QuizService {
    Question[] questions = new Question[5];

    public QuizService() {
        questions[0] = new Question(1, "What is the capital of France?", new String[]{"Paris", "London", "Rome", "Berlin"}, "Paris");
        questions[1] = new Question(2, "What is the largest planet in our solar system?", new String[]{"Earth", "Jupiter", "Saturn", "Mars"}, "Jupiter");
        questions[2] = new Question(3, "Who wrote 'To Kill a Mockingbird'?", new String[]{"Harper Lee", "Mark Twain", "J.K. Rowling", "Ernest Hemingway"}, "Harper Lee");
        questions[3] = new Question(4, "What is the chemical symbol for water?", new String[]{"H2O", "CO2", "O2", "NaCl"}, "H2O");
        questions[4] = new Question(5, "Who painted the Mona Lisa?", new String[]{"Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Michelangelo"}, "Leonardo da Vinci");
    }

    public void displayQuestions() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println(q.getId() + ". " + q.getQuestion());
            String[] options = q.getOpt();
            for (int i = 0; i < options.length; i++) {
                System.out.println((char)('A' + i) + ". " + options[i]);
            }
            System.out.println();

            System.out.print("Enter your answer for question " + q.getId() + ": ");
            String userAnswer = scanner.nextLine().trim();
            if (userAnswer.equalsIgnoreCase(q.getAnswer())) {
                score++;
            }
            System.out.println();
        }

        System.out.println("Your final score is: " + score + "/" + questions.length);

    }
}