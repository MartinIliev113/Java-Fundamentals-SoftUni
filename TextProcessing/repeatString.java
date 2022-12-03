package TextProcessing;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr=scanner.nextLine().split(" ");
        String str="";
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length() ; j++) {
                str+=arr[i];
            }
        }
        System.out.println(str);
    }
}
