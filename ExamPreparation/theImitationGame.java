package ExamPreparation;

import java.util.Scanner;

public class theImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Decode")){
            String[] token=input.split("\\|");
            String action=token[0];
            switch (action){
                case "Move": {
                    int numLetters=Integer.parseInt(token[1]);
                    String fistPart=message.substring(0,numLetters);
                    String secondPart=message.substring(numLetters);
                    message=secondPart+fistPart;
                    break;
                }
                case "Insert": {
                    int index=Integer.parseInt(token[1]);
                    String value=token[2];
                    String firstPart=message.substring(0,index);
                    String secondPart=message.substring(index);
                    message=firstPart+value+secondPart;
                    break;
                }
                case "ChangeAll":{
                    message=message.replace(token[1],token[2]);
                    break;
                }
            }
            input=scanner.nextLine();
        }
        System.out.println("The decrypted message is: "+message);
    }
}