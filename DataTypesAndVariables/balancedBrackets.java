package DataTypesAndVariables;

import java.util.Scanner;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int brackets=0;
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            if (text.equals("("))
                brackets++;
            else if (text.equals(")")) {
                if(brackets>0)
                    brackets--;
            }
        }
        if(brackets==0)
            System.out.println("BALANCED");
        else
            System.out.println("UNBALANCED");
    }
}
