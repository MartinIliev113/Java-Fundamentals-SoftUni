package BasicSyntax;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        double faki=1,fakj=1,fak=0;
        int startnum=number;

        while (number>0){
            int lastDigit=number%10;
            for (int i = 1; i <=lastDigit ; i++) {
                fakj*=i;

            }
            fak+=fakj;
            number/=10;
        }
        if(startnum==fak)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
