package Methods;

import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne=Integer.parseInt(scanner.nextLine());
        int numTwo=Integer.parseInt(scanner.nextLine());
        int numThree=Integer.parseInt(scanner.nextLine());
        System.out.println(getSmallest(numOne,numTwo,numThree));
    }
    private static int getSmallest(int a,int b,int c){
        int smallest=a;
        if(b<a)
            smallest=b;
        if (c<a)
                smallest=c;
        return smallest;
    }
}
