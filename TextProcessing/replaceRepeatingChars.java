package TextProcessing;

import java.util.Scanner;

public class replaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String result="";
        char firstOccur=text.charAt(0);
        result+=firstOccur;
        for (int i = 1; i < text.length(); i++) {
            if(text.charAt(i)!=firstOccur){
                firstOccur=text.charAt(i);
                result+=text.charAt(i);
            }

        }
        System.out.println(result);
    }
}
