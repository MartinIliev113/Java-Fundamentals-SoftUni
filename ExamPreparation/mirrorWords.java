package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words=scanner.nextLine();
        String regex="(@|#)(?<word>[A-Za-z]{3,})\\1\\1(?<mirror>[A-Za-z]{3,})\\1";
        List<String> hiddenWords=new ArrayList<>();
        List <String> mirrorWords=new ArrayList<>();
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(words);
        int pairCount=0;
        while (matcher.find()){
            pairCount++;
            String word= matcher.group("word");
            String secondWord=new StringBuilder(matcher.group("mirror")).reverse().toString();
            if(word.equals(secondWord)){
                mirrorWords.add(word+" <=> "+matcher.group("mirror"));
            }
        }
        if(pairCount>0)
            System.out.println(pairCount+" word pairs found!");
        else System.out.println("No word pairs found!");

        if(mirrorWords.size()==0){
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ",mirrorWords));
        }
    }
}

