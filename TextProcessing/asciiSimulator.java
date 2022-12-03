package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asciiSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char fistChar=scanner.nextLine().charAt(0);
        char secondChar=scanner.nextLine().charAt(0);
        String text=scanner.nextLine();
        List <Character> chars=new ArrayList<>();
        for (int i = fistChar+1; i <secondChar ; i++) {
            chars.add((char) i);
        }
        int sum=0;
        for (char symbol:text.toCharArray()) {
            if(chars.contains(symbol)){
                sum+=symbol;
            }
        }
        System.out.println(sum);
    }
}
