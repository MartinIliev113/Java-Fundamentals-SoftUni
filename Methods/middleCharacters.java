package Methods;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        printMiddleCharacters(text);
    }
    private static void printMiddleCharacters(String text){
        if(text.length()%2!=0){
            int indexOfMiddleChar=text.length()/2;
            System.out.println(text.charAt(indexOfMiddleChar));
        }
        else {
            int indexOfFirstMiddleCharacter=text.length()/2-1;
            int indexOfSecondMiddleCharacter=text.length()/2;
            System.out.println(text.charAt(indexOfFirstMiddleCharacter)+""+text.charAt(indexOfSecondMiddleCharacter));
        }
    }
}
