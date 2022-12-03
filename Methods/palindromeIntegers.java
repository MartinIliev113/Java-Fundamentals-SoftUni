package Methods;

import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number=scanner.nextLine();
        while (!number.equals("END")){
            if(isPalindrome(number))
                System.out.println("true");
            else
                System.out.println("false");
            number=scanner.nextLine();
        }
    }
    private static boolean isPalindrome(String n){
        String reversedNum="";
        for (int i = n.length()-1; i >=0 ; i--) {
            reversedNum+=n.charAt(i);
        }
        return n.equals(reversedNum);
    }

}
