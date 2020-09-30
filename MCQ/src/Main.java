import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] OPTIONS = {"A", "B", "C"};
        String question = "For a discrete LTI system, what is the criteria for stability?";

        String optionA = "A The poles must not be in RHP of the complex plane";
        String optionB = "B The poles must be within a unit circle in a complex plane";
        String optionC = "C The number of clockwise encirclements of -1 must be equal to the number of RHP poles";

        String outputA = "Wrong! This is stability for a continuous LTI system";
        String outputB = "Correct!";
        String outputC = "Wrong! This is the Nyquist Stability Criterion for a closed loop system";
        String outputError = "Invalid input, try again";

        Scanner input = new Scanner(System.in);
        boolean validAnswer = false;

        System.out.println(question);

        System.out.println(optionA);
        System.out.println(optionB);
        System.out.println(optionC);

        String answer;

        while (!validAnswer) {
            answer = input.next();
            switch (answer) {
                case "A" -> System.out.println(outputA);
                case "B" -> System.out.println(outputB);
                case "C" -> System.out.println(outputC);
                default -> System.out.println(outputError);
            }
            if (Arrays.asList(OPTIONS).contains(answer)) {
                validAnswer = true;
            }
        }
    }
}
