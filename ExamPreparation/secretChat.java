package ExamPreparation;

import java.util.Scanner;

public class secretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message= new StringBuilder(scanner.nextLine());
        String input=scanner.nextLine();
        while (!input.equals("Reveal")){
            String[] command=input.split(":\\|:");
            if(input.contains("InsertSpace")){
                message.insert(Integer.parseInt(command[1])," ");
                System.out.println(message);
            } else if (input.contains("Reverse")) {
                if(message.toString().contains(command[1])){
                    int startIndex=message.indexOf(command[1]);
                    int endIndex=startIndex+command[1].length()+1;
                    message.delete(startIndex,endIndex);
                    StringBuilder reversed=new StringBuilder(command[1]);
                    reversed.reverse();
                    message.append(reversed);
                    System.out.println(message);
                }else {
                    System.out.println("error");
                }
            } else if (input.contains("ChangeAll")) {
                message = new StringBuilder(message.toString().replace(command[1], command[2]));
                System.out.println(message);
            }

            input=scanner.nextLine();
        }
        System.out.println("You have a new text message: "+message );

    }
}
