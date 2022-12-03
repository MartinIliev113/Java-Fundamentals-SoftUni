package TextProcessing;

import java.util.Scanner;

public class stringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        StringBuilder text=new StringBuilder(input);
        int totalStrength=0;
        for (int i = 0; i <text.length() ; i++) {
            char symbol= text.charAt(i);

            if(symbol=='>'){
                int attackStrength= Integer.parseInt(text.charAt(i+1)+"");
                totalStrength+=attackStrength;
            } else if (symbol!='>'&&totalStrength>0) {
                text.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.println(text);
    }
}
