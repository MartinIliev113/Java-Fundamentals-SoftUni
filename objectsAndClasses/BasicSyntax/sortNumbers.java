package BasicSyntax;

import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        if (a > b && a > c){
            System.out.println(a);
            if (b > c){
                System.out.println(b);
                System.out.println(c);
            }else {
                System.out.println(c);
                System.out.println(b);
            }
        }else if (b > a && b > c){
            System.out.println(b);
            if (a > c){
                System.out.println(a);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(a);
            }
        }else if (c > a && c > b){
            System.out.println(c);
            if (b > a){
                System.out.println(b);
                System.out.println(a);
            }else{
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}
