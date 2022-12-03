package BasicSyntax;

import java.util.Scanner;
public class reverseString {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String string=scanner.nextLine(),reversedString="";
            for (int i = string.length()-1; i >=0 ; i--) {
                char currentSymbol=string.charAt(i);
                reversedString+=currentSymbol;
            }
            System.out.println(reversedString);
        }
    }

