package AsociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Double> ordersMap = new LinkedHashMap<>();
        String input=scanner.nextLine();
        while (!input.equals("buy")){
            String product=input.split(" ")[0];
            double price=Double.parseDouble(input.split(" ")[1]);
            double quantity=Double.parseDouble(input.split(" ")[2]);
            double totalPrice=price*quantity;
            ordersMap.putIfAbsent(product,0.0);
            ordersMap.put(product,totalPrice);
            input=scanner.nextLine();
        }
        ordersMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue()));


    }
}
