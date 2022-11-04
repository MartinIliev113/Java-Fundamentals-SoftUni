package DataTypesAndVariables;

import java.util.Scanner;

public class fromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++) {
            int sum=0;
            long n1=Long.parseLong(scanner.next());
            long n2=Long.parseLong(scanner.next());

            if(n1>n2){
                long num1=Math.abs(n1);
                while(num1>0){
                    long digit= num1%10;
                    sum+=digit;
                    num1/=10;
                }
            } else {
                long num2=Math.abs(n2);
                while (num2>0){
                    long digit=num2%10;
                    sum+=digit;
                    num2/=10;
                }
            }
            System.out.println(sum);
        }
    }
}

