package ExamPreparation;

import java.util.Scanner;

public class passwordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        String input=scanner.nextLine();
        while (!input.equals("Done")){
            String[] command=input.split(" ");
            switch (command[0]){
                case "TakeOdd":
                    StringBuilder newPass=new StringBuilder();
                    for (int i = 0; i <text.toCharArray().length ; i++) {
                        if(i%2!=0){
                            newPass.append(text.charAt(i));
                        }
                    }
                    text=newPass.toString();
                    System.out.println(text);
                    break;
                case "Cut":
                    int index=Integer.parseInt(command[1]);
                    int length=Integer.parseInt(command[2]);
                    String substring=text.substring(index,index+length);
                    text=text.replaceFirst(substring,"");
                    System.out.println(text);
                    break;
                case "Substitute":
                    String substringToReplace=command[1];
                    String substitute=command[2];
                    if(text.contains(substringToReplace)){
                        text=text.replaceAll(substringToReplace,substitute);
                        System.out.println(text);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
            }
            input=scanner.nextLine();
        }
        System.out.println("Your password is: "+text);
    }
}
