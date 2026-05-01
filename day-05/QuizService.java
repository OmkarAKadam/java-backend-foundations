import java.util.Scanner;

class QuizService {
    private int score = 0;

    Question[] questions = new Question[5];

    public QuizService() {
        questions[0] = new Question(1, "What is the capital of France?", new String[]{"Paris", "London", "Rome", "Berlin"}, "A. Paris");
        questions[1] = new Question(2, "What is the largest planet in our solar system?", new String[]{"Earth", "Jupiter", "Saturn", "Mars"}, "B. Jupiter");
        questions[2] = new Question(3, "Who wrote 'To Kill a Mockingbird'?", new String[]{"Harper Lee", "Mark Twain", "J.K. Rowling", "Ernest Hemingway"}, "A. Harper Lee");
        questions[3] = new Question(4, "What is the chemical symbol for water?", new String[]{"H2O", "CO2", "O2", "NaCl"}, "A. H2O");
        questions[4] = new Question(5, "Who painted the Mona Lisa?", new String[]{"Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Michelangelo"}, "C. Leonardo da Vinci");
    }

    public String displayQuestions(Scanner scanner) {

    String[] userAnswerSet = new String[questions.length];

        for (Question q : questions) {
            System.out.println(q.getId() + ". " + q.getQuestion());
            String[] options = q.getOpt();
            for (int i = 0; i < options.length; i++) {
                System.out.println((char)('A' + i) + ". " + options[i]);
            }
            System.out.println();

            System.out.print("Enter your answer for question " + q.getId() + ": ");
            String userAnswer = scanner.nextLine().trim();
            while (!userAnswer.matches("[A-Da-d]")) {
                System.out.print("Invalid input. Please enter A, B, C, or D: ");
                userAnswer = scanner.nextLine().trim().toUpperCase();
            }

            if (userAnswer.equalsIgnoreCase(q.getAnswer().charAt(0) + "")) {
                score++;
            }
            userAnswerSet[q.getId() - 1] = userAnswer.toUpperCase();

            System.out.println();
        }

        displaySummary(userAnswerSet);

        return "Your final score is: " + score + "/" + questions.length;

    }

    public void displaySummary(String[] userAnswerSet) {
        System.out.println("Quiz Summary:");

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            String[] options = q.getOpt();
            String userAnswer = userAnswerSet[i] != null ? userAnswerSet[i] : "No Answer";
            String correctAnswer = q.getAnswer();

            System.out.println(q.getId() + ". " + q.getQuestion());

            String displayedUserAnswer = userAnswer;
            for (int j = 0; j < options.length; j++) {
                char optionLetter = (char)('A' + j);
                if (Character.toLowerCase(optionLetter) == Character.toLowerCase(userAnswer.charAt(0))) {
                    displayedUserAnswer = optionLetter + ". " + options[j];
                    break;
                }
            }

            System.out.println("Your answer: " + displayedUserAnswer);
            System.out.println("Correct answer: " + correctAnswer);
            System.out.println();
        }
    }
}