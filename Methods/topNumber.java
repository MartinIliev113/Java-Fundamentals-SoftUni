package Methods;

import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printTop(n);
    }
    private static void printTop(int number) {
        for (int i = 0; i <number; i++) {
            int sum = 0;
            boolean devisible=false;
            boolean oddNumber=false;
            int num=i;
            int n=i;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            if(sum%8==0)
                devisible=true;
            while (n>0){
                int digit=n%10;
                if(digit%2!=0)
                    oddNumber=true;
                n/=10;
            }
            if(devisible && oddNumber)
                System.out.println(i);
        }
    }


}
