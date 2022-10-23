package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean equal = true;
        int sum = 0, difference = 0;
        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < firstArray.length; i++) {
            sum += firstArray[i];
            if (firstArray[i] != secondArray[i]) {
                equal = false;
                difference = i;
                break;
            }
        }
        if (equal)
            System.out.printf("Arrays are identical. Sum: %d", sum);
        else
            System.out.printf("Arrays are not identical. Found difference at %d index.", difference);
    }
}