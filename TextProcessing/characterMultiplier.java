package TextProcessing;

import java.util.Scanner;

public class characterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        System.out.printf("%.0f",multiplier(input[0],input[1]));
    }

    private static double multiplier(String fistText, String secondText) {
        double totalSum = 0;
        if (fistText.length() > secondText.length()) {
            for (int i = 0; i < secondText.length(); i++) {
                totalSum += fistText.charAt(i) * secondText.charAt(i);
            }
            for (int i = fistText.length() - 1; i >= secondText.length(); i--) {
                totalSum += fistText.charAt(i);
            }
        } else if (secondText.length() > fistText.length()) {
            for (int i = 0; i < fistText.length(); i++) {
                totalSum += fistText.charAt(i) * secondText.charAt(i);
            }
            for (int i = secondText.length() - 1; i >= fistText.length(); i--) {
                totalSum += secondText.charAt(i);
            }
        } else
            for (int i = 0; i < fistText.length(); i++) {
                totalSum += fistText.charAt(i) * secondText.charAt(i);
            }
        return totalSum;
    }
}
