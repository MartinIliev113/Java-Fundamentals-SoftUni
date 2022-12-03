package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String regex="@#+[A-Z][a-zA-Z0-9]{4,}[A-Z]@#+";
        Pattern pattern=Pattern.compile(regex);
        for (int i = 0; i <n ; i++) {
            StringBuilder code=new StringBuilder();
            String barcode=scanner.nextLine();
            Matcher matcher= pattern.matcher(barcode);
            if(matcher.find()){
                for (char symbol:barcode.toCharArray()) {
                    if(Character.isDigit(symbol)){
                        code.append(symbol);
                    }
                }
                if(code.length()>0)
                    System.out.println("Product group: "+code);
                else
                    System.out.println("Product group: 00");
            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
