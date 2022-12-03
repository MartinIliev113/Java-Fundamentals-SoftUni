package ExamPreparation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        String regex="(:{2}|\\*{2})(?<word>[A-Z][a-z]{2,})\\1";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        BigInteger coolThreshold=new BigInteger(String.valueOf(1));
        for (char symbol:text.toCharArray()) {
            if(Character.isDigit(symbol)){
                BigInteger digit=new BigInteger(String.valueOf(symbol));
                coolThreshold=coolThreshold.multiply(digit);
            }
        }
        System.out.println("Cool threshold: "+coolThreshold);
        List<String> coolEmojis=new ArrayList<>();
        int validEmojis=0;
        while (matcher.find()){
            validEmojis++;
            String emoji=matcher.group("word");
            int coolness=0;
            for (char symbol:emoji.toCharArray()) {
                coolness+=symbol;
            }
            BigInteger cool=new BigInteger(String.valueOf(coolness));
            int compareValue=cool.compareTo(coolThreshold);
            if(compareValue!=-1){
                coolEmojis.add(matcher.group());
            }
        }
        System.out.println(validEmojis+" emojis found in the text. The cool ones are:");
        for (String elem:coolEmojis) {
            System.out.println(elem);
        }
    }
}
