package Methods;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputGrade = Double.parseDouble(scanner.nextLine());
        printGrade(inputGrade);
    }

    public static void printGrade(double grade) {
        if (grade < 3)
            System.out.println("Fail");
        else if (grade >= 3 && grade <= 3.49)
            System.out.println("Poor");
        else if (grade >= 3.5 && grade <= 4.49)
            System.out.println("Good");
        else if (grade >= 4.5 && grade <= 5.49)
            System.out.println("Very good");
        else if (grade >= 5.5 && grade <= 6)
            System.out.println("Excellent");

    }
}
