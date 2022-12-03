package ExamPreparation;

import java.util.Scanner;

public class activationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey=scanner.nextLine();
        String input=scanner.nextLine();
        while (!input.equals("Generate")){
            String[] command=input.split(">>>");
            switch (command[0]){
                case "Contains":
                    if(activationKey.contains(command[1]))
                        System.out.printf("%s contains %s\n",activationKey,command[1]);
                    else
                        System.out.println("Substring not found!");
                    break;
                case "Flip":
                    String upperOrLower=command[1];
                    int flipStart=Integer.parseInt(command[2]);
                    int flipEnd=Integer.parseInt(command[3]);
                    String flipSubString=activationKey.substring(flipStart,flipEnd);
                    if(upperOrLower.equals("Upper"))
                        activationKey=activationKey.replace(flipSubString,flipSubString.toUpperCase());
                    else
                        activationKey=activationKey.replace(flipSubString,flipSubString.toLowerCase());
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int sliceStart=Integer.parseInt(command[1]);
                    int sliceEnd=Integer.parseInt(command[2]);
                    String sliceSubstring=activationKey.substring(sliceStart,sliceEnd);
                    activationKey=activationKey.replace(sliceSubstring,"");
                    System.out.println(activationKey);
            }
            input=scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s\n",activationKey);
    }
}
