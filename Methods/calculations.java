package Methods;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calculation=scanner.nextLine();
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        switch (calculation){
            case "add":
                System.out.println(add(a,b));
                break;
            case "multiply":
                System.out.println(multiply(a,b));
                break;
            case "subtract":
                System.out.println(subtract(a,b));
                break;
            case "divide":
                System.out.println(divide(a,b));
                break;
        }


    }
    public static int add(int num1,int num2){
        int c=num1+num2;
        return c;
    }
    public static int multiply(int num1,int num2){
        int c=num1*num2;
        return c;
    }
    public static int subtract(int num1,int num2){
        int c=num1-num2;
        return c;
    }
    public static int divide(int num1, int num2){
        int c=num1/num2;
        return c;
    }
}
