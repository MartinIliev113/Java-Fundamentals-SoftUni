package TextProcessing;

import java.util.Scanner;

public class validUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames=scanner.nextLine().split(", ");
        for (int i = 0; i <usernames.length ; i++) {
            boolean isValid=false;
            if(usernames[i].length()>=3 && usernames[i].length()<=16){
                isValid=true;
                for (int j = 0; j <usernames[i].length() ; j++) {
                    char symbol=usernames[i].charAt(j);
                    if(!Character.isLetter(symbol) && !Character.isDigit(symbol)
                            && symbol!='-' && symbol !='_'){
                        isValid=false;
                        break;
                    }
                }
            }
            if(isValid){
                System.out.println(usernames[i]);
            }
        }
    }
}
