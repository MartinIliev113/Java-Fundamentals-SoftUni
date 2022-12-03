package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>furnitureName=new ArrayList<>();
        double totalMoney=0;
        String input=scanner.nextLine();
        String regex=">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern=Pattern.compile(regex);
        while (!input.equals("Purchase")){
            Matcher matcher= pattern.matcher(input);
            if(matcher.find()){
                String furniture= matcher.group("furniture");
                double price=Double.parseDouble(matcher.group("price"));
                int quantity=Integer.parseInt(matcher.group("quantity"));
                totalMoney+=price*quantity;
                furnitureName.add(furniture);
            }

            input=scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureName.forEach(n -> System.out.println(n));
        System.out.printf("Total money spend: %.2f",totalMoney);
    }
}
