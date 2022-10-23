package Methods;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        System.out.println(calcArea(a,b));
    }
    public static int calcArea(int a,int b){
        int c=a*b;
        return c;
    }
}
