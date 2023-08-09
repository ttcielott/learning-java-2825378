import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("Dana", "Kim", 2011, 3.5, "English");
        StudentProfile studentB = new StudentProfile("Mattia", "Branca", 2010, 3.6, "Psychology");

        System.out.println(studentA.getFullName());
        System.out.println(studentA.yearToGraduate);
        studentA.incrementGradutionYear();
        System.out.println(studentA.yearToGraduate);
        System.out.println(studentA.convertToUkGrades());
    }
}
