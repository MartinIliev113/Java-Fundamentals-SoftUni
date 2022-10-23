package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] condensed=new int[numbers.length-1];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers.length==1)
                break;
            if(i== numbers.length-1) {
                int[] condensedNew=new int[condensed.length-1];
                i= -1;
                numbers=condensed;
                condensed=condensedNew;
            }
            else
            condensed[i]=numbers[i]+numbers[i+1];
        }
        System.out.println(numbers[0]);
    }
}
