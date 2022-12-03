package TextProcessing;

import java.util.Scanner;

public class extractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String text=scanner.nextLine();
            int startNameIndex= text.indexOf("@");
            int lastNameIndex= text.indexOf("|");
            int startAgeIndex= text.indexOf("#");
            int lastAgeIndex= text.indexOf("*");
            String name= text.substring(startNameIndex+1,lastNameIndex);
            String age=text.substring(startAgeIndex+1,lastAgeIndex);
            System.out.printf("%s is %s years old.\n",name,age);
        }
    }
}
