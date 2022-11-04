package Methods;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password=scanner.nextLine();
        isValid(password);

    }
    private static void isValid(String pass){
        if (!checkLength(pass))
            System.out.println("Password must be between 6 and 10 characters");
        if(!isValidContent(pass))
            System.out.println("Password must consist only of letters and digits");
        if (!checkNumbers(pass))
            System.out.println("Password must have at least 2 digits");
        if(checkLength(pass)&&isValidContent(pass)&&checkNumbers(pass))
            System.out.println("Password is valid");
    }
   private static boolean checkLength(String pass){
//        if (pass.length()>=6&&pass.length()<=10)
//            return true;
//        else
//            return false;
       return pass.length()>=6&&pass.length()<=10;
    }
    private static boolean isValidContent(String pass){
        for (char symbol: pass.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol))
               return false;
            }
        return true;
    }
    private static boolean checkNumbers(String pass){
        int numbers=0;
        for (char symbol:pass.toCharArray()) {
            if (Character.isDigit(symbol))
                numbers++;
        }
            if (numbers>=2)
                return true;
            return false;
        }
    }



