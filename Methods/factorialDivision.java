package Methods;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());
        double division=1.0*factFinder(number1)/factFinder(number2);
        System.out.printf("%.2f",division);
    }
    private static long factFinder(int number){
        long fact=1;
        for (int i = 1; i <=number ; i++) {
            fact*=i;
        }
        return fact;
    }
}
