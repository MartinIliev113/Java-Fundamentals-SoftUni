package TextProcessing;

import java.util.Scanner;

public class digits_lettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        StringBuilder digit=new StringBuilder();
        StringBuilder letter=new StringBuilder();
        StringBuilder other=new StringBuilder();
        for (int i = 0; i <text.length() ; i++) {
            if(Character.isDigit(text.charAt(i))) {
                digit.append(text.charAt(i));
            } else if (Character.isLetter(text.charAt(i))) {
                letter.append(text.charAt(i));
            }
            else {
                other.append(text.charAt(i));
            }
        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(other);
    }
}
