package BasicSyntax;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username=scanner.nextLine();
        String password="";
        for (int i = username.length()-1; i >=0;  i--) {
            char currentSymbol=username.charAt(i);
            password+=currentSymbol;
        }
        String pass=scanner.nextLine();
        int tryy=0;
        while (!pass.equals(password)){
            tryy++;
            if(tryy==4){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            pass=scanner.nextLine();
        }
        if(pass.equals(password)){
            System.out.printf("User %s logged in.",username);
        }
    }
}
