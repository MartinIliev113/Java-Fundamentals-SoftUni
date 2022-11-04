package List;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items =  Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            if (input.contains("Collect")) {
                if (!items.contains(input.split(" - ")[1])) {
                    items.add(input.split(" - ")[1]);
                }
            } else if (input.contains("Drop")) {
                    items.remove(input.split(" - ")[1]);
            } else if (input.contains("Combine")) {
                String[] command = input.split(" - ");
                String[] item = command[1].split(":");
                if (items.contains(item[0])) {
                    int indexOldItem= items.indexOf(item[0]);
                    items.add(indexOldItem + 1, item[1]);
                }
            } else if (input.contains("Renew")) {
                if (input.contains(input.split(" - ")[1])) {
                    items.remove(input.split(" - ")[1]);
                    items.add(input.split(" - ")[1]);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", items));
    }
}