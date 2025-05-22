import java.util.Scanner;

public class Question {
    String questionText;
    String[] options;
    char correctAnswer;

    Question(String questionText, String[] options, char correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    void display() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            char optionLabel = (char) ('A' + i);
            System.out.println(optionLabel + "," + options[i]);
        }
    }

    boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == correctAnswer;

    }
}

public class QuizGame {
    static Scanner scanner = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {
        System.out.println("Welcom to the java quiz game!\n");

        Question[] questions = {
                new Question("What is the capital of France?",
                        new String[]{"Berlin", "Paris", "Rome", "Madrid"}, 'B'),
                new Question("Who developed java programming laguage?",
                        new String[]{"James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", "Guido van Rossum"}, 'A'),
                new Question("Which keyword is used to inherit a class in java?",
                        new String[]{"this", "super", "extends", "implements"}, 'C'),
                new Question("What does JVM stands for?",
                        new String[]{"Java visual Machine", "Java Virtual Machine", "Joint Virtual Machine", "Just Virtual Machine"}, 'B')
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question" + (i + 1) + ":");
            questions[i].display();
            System.out.println("Your Answer (A/B/C/D): ");
            char answer = scanner.nextLine().toUpperCase().charAt(0);

            if (questions[i].isCorrect(answer)) {
                System.out.println("Correct\n");
                score++;
            } else {
                System.out.println("Worng! Correct answer was:" + questions[i].correctAnswer + "\n");
            }
        }
        System.out.println("Quiz over! Yiur score: " + score + " out of " + questions.length);
        if (score == questions.length) {
            System.out.println("Excellent! you got all the answers right!");
        } else if (score > +questions.length / 2) {
            System.out.println("Good job ! Keep practicing.");
        } else {
            System.out.println("Keep learning! Practice makes perfect. ");
        }
    }
}