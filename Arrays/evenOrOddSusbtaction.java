package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class evenOrOddSusbtaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven=0,sumOdd=0,difference=0;
        int numbers[]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]%2==0)
                sumEven+=numbers[i];
            else
                sumOdd+=numbers[i];
        }
        difference=sumEven-sumOdd;
        System.out.println(difference);
    }
}