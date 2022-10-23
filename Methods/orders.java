package Methods;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        calculatePrice(product,quantity);
    }

    public static void calculatePrice(String p, double q) {
        switch (p) {
            case "coffee":
                System.out.printf("%.2f",q * 1.5);
                break;
            case "water":
                System.out.printf("%.2f",q * 1);
                break;
            case "coke":
                System.out.printf("%.2f",q * 1.4);
                break;
            case "snacks":
                System.out.printf("%.2f",q * 2);
                break;

        }
    }
}
