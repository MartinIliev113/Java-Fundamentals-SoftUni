package Methods;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());
        int sum=sum(num1,num2);
        System.out.println(subtract(sum,num3));
    }
    private static int sum(int n1,int n2){
        return n1+n2;
    }
    private static int subtract(int n1,int n2){
        return n1-n2;
    }
}
