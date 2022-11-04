package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class topInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < numbers.length ; i++) {
            int currentNumber=numbers[i];
            boolean isBiggest=false;
            if(i==numbers.length-1){
                System.out.print(currentNumber);
                continue;
            }
            for (int j = i+1; j <numbers.length ; j++) {
                if(currentNumber>numbers[j]){
                    isBiggest=true;
                }
                else {
                    isBiggest=false;
                    break;
                }
            }
            if(isBiggest){
                System.out.print(currentNumber+" ");
            }
        }

    }
}
