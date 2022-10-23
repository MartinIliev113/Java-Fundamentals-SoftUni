package Methods;

import java.util.Scanner;

public class multiplyEvensByIOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvenesAndOdds(n));
    }
    private static int getEvensSum(int n){
        n=Math.abs(n);
        int evenSum=0;
        for (int i = 0; i <n ; i++) {
            while (n>0){
                int digit=n%10;
                n/=10;
                if(digit%2==0)
                    evenSum+=digit;
            }
        }
        return evenSum;
    }
    private static int getOddsSum(int n){
        n=Math.abs(n);
        int oddSum=0;
        for (int i = 0; i <n ; i++) {
            while (n>0){
                int digit=n%10;
                n/=10;
                if(digit%2!=0)
                    oddSum+=digit;
            }
        }
        return oddSum;
    }
    private static int getMultipleOfEvenesAndOdds(int n){
        int evenSum=getEvensSum(n);
        int oddSum=getOddsSum(n);
        return  evenSum*oddSum;
    }
}

