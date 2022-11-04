package DataTypesAndVariables;

import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int m=Integer.parseInt(scanner.nextLine());
        int y=Integer.parseInt(scanner.nextLine());
        int fiftyPercentN= n/2;
        int targets=0;
        while (n>=m){
            n-=m;
            targets++;
            if(n==fiftyPercentN){
                if(y!=0)
                n/=y;
            }
        }
        System.out.println(n);
        System.out.println(targets);

    }
}
