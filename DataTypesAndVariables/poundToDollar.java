package DataTypesAndVariables;

import java.util.Scanner;

public class poundToDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pound=Double.parseDouble(scanner.nextLine());
        double dollar=pound*1.36;
        System.out.printf("%.3f",dollar);
    }
}