package Methods;

import java.util.Locale;
import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        System.out.println(getVowels(text));

    }
    private static int getVowels(String text){
        int vowels=0;
        String[] letterArray= text.toLowerCase(Locale.ROOT).split("");
        for (int i = 0; i < letterArray.length; i++) {
            switch (letterArray[i]){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "y":
                    vowels++;
                    break;
            }
        }
        return vowels;
    }
}
