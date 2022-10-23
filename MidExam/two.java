package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffeeList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if(input.contains("Include")){
                coffeeList.add(input.split(" ")[1]);
            }
           else if(input.contains("Remove")){
                coffeeList.remove(input.split(" ")[1]);
            } else  if(input.contains("Remove")) {


            }

        }
        System.out.println("Coffees:\n");
        System.out.println(coffeeList.toString().replaceAll("[\\[\\],]",""));
    }
}
