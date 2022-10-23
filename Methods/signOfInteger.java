package Methods;

import java.util.Scanner;

public class signOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printNumbersSign(num);
    }

    public static void printNumbersSign(int n){
        if(n>0)
            System.out.printf("The number %d is positive.",n);
        else if (n<0)
            System.out.printf("The number %d is negative.",n);
        else
            System.out.printf("The number %d is zero.",n);
    }
}
