package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class equalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumLeft = 0, sumRight = 0;
        boolean equal = false;
        int numbers[] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        if (numbers.length == 1) {
            equal = true;
            System.out.println(0);
        } else {
            for (int i = 0; i < numbers.length; i++) {
                sumRight = 0;
                sumLeft =0;
                for (int j = 0; j <i ; j++) {
                    sumLeft+=numbers[j];
                }

                for (int j = i+1; j < numbers.length; j++) {
                    sumRight += numbers[j];
                }
                if (sumLeft == sumRight) {
                    System.out.println(i);
                    equal = true;
                    break;
                }
            }
            if (!equal) {
                System.out.println("no");
            }
        }
    }
}
