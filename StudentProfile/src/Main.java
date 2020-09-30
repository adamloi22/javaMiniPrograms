import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("H", "T", 4.0, 2020, "Chemical Engineering");
        Student studentB = new Student("J", "O", 4.0, 2021, "Physics");

        System.out.println("H's' expected year to graduate: " + studentA.expectedYearToGraduate);
        System.out.println("J's expected year to graduate: " + studentB.expectedYearToGraduate);

        Scanner input = new Scanner(System.in);
        System.out.println("Type A to increment student A's expected year to graduate, B for student B");
        String userInput = input.next();

        switch (userInput) {
            case "A" -> studentA.incrementExpectedYearToGraduate();
            case "B" -> studentB.incrementExpectedYearToGraduate();
            default -> System.out.println("invalid input");
        }

        System.out.println("Henry's expected year to graduate: " + studentA.expectedYearToGraduate);
        System.out.println("Joseph's expected yera to graduate: " + studentB.expectedYearToGraduate);
    }
}
