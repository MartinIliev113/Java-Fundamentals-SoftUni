package DataTypesAndVariables;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int days=0,spices=0;
        int yield=Integer.parseInt(scanner.nextLine());
        while(yield>=100){
             spices+=yield-26;
             yield-=10;
             days++;
        }
        spices-=26;
        System.out.println(days);
        System.out.println(spices);
    }
}
