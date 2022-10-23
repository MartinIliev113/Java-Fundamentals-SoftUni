package Arrays;

import java.util.Scanner;

public class commnonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray=scanner.nextLine().split(" ");
        String[] secondArray=scanner.nextLine().split(" ");
        String output="";
        for (String elem:
             secondArray) {
            for (String element:
                 firstArray) {
                if(elem.equals(element)){
                    output+=elem+" ";
                }
            }

        }
        System.out.println(output);
    }
}
