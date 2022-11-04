package objectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class randomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd=new Random();

        String input=scanner.nextLine();
        String[] wordsArr=input.split("\\s+");
        for (int i = 0; i <wordsArr.length ; i++) {
            int indexX=rnd.nextInt(wordsArr.length);
            int indexY=rnd.nextInt(wordsArr.length);

            String oldWord=wordsArr[indexX];
            wordsArr[indexX]=wordsArr[indexY];
            wordsArr[indexY]=oldWord;
        }
        System.out.println(String.join(System.lineSeparator(),wordsArr));
    }
}
