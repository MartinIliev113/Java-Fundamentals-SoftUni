package DataTypesAndVariables;

import java.util.Scanner;

public class charToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first=scanner.nextLine().charAt(0);
        char second=scanner.nextLine().charAt(0);
        char third=scanner.nextLine().charAt(0);
        String string=String.format("%c%c%c",first,second,third);
        System.out.println(string);

    }
}