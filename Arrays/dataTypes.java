package Arrays;

import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  dataType=scanner.nextLine();
        switch (dataType){
            case "int":
                int num=Integer.parseInt(scanner.nextLine());
                dataInt(num);
                break;
            case "real":
                double number=Double.parseDouble(scanner.nextLine());
                dataReal(number);
                break;
            case "string":
                String text=scanner.nextLine();
                dataString(text);
                break;
        }
    }
    private static void dataInt(int n){
        System.out.println(n*2);
    }
    private static void dataReal(double n)
    {
        System.out.printf("%.2f",n*1.5);
    }
    private static void dataString(String text){
        System.out.println("$"+text+"$");
    }

}
