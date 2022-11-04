package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number[] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int length = 1, maxLength = 0, startIndex = 0, bestStatIndex = 0;
        for (int i = 1; i < number.length; i++) {
            if (number[i] == number[i - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                bestStatIndex = startIndex;
            }
        }
        for (int i = bestStatIndex; i < bestStatIndex + maxLength; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
