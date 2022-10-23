package Methods;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine();
        int n=Integer.parseInt(scanner.nextLine());
        String newString=repeatedString(string,n);
        System.out.println(newString);
    }
    public static String repeatedString(String str, int times){
        String newStr="";
        for (int i = 1; i <=times ; i++) {
            newStr+=str;
        }
        return newStr;
    }
}
