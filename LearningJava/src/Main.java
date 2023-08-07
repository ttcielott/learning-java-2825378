import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String  question = "Which year did WW2 break out? ";
        String  choiceOne = "1943";
        String  choiceTwo = "1939";
        String  choiceThree = "1941";
        int correctAnswer = 2;

        while(true) {
            System.out.println(question);
            System.out.println("1. " + choiceOne);
            System.out.println("2. " + choiceTwo);
            System.out.println("3. " + choiceThree);

            Scanner input = new Scanner(System.in);
            int userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Congratualtions! Your answer is correct.");
                break;
            } else {
                System.out.println("That's not a right answer. The correct answer is 2. 1939.");
            }
        }
    }
}
