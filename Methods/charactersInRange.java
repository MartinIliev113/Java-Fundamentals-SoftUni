package Methods;

import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charA = scanner.nextLine().charAt(0);
        char charB = scanner.nextLine().charAt(0);
        System.out.println(getChar(charA, charB));
    }

    private static String getChar(char a, char b) {
        String textChars = "";
        if (a < b) {
            for (char i= (char) (a + 1); i < b; i++) {
                textChars += ((char) i) + " ";
            }
            return textChars;

        } else  {
            for (char i = (char) (b + 1); i < a; i++) {
                textChars += ((char) i) + " ";
            }
            return textChars;

        }
    }

}
