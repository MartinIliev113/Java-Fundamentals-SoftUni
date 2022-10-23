package DataTypesAndVariables;

import java.util.Scanner;

public class floatingEquiality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double eps=0.000001;
        double a=Double.parseDouble(scanner.nextLine());
        double b=Double.parseDouble(scanner.nextLine());
        boolean equals=Math.abs(a-b)<eps;
        if(equals)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
