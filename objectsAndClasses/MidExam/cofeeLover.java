package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cofeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffeeList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Include":
                    coffeeList.add(command[1]);
                    break;
                case "Remove":
                    if (coffeeList.size() > Integer.parseInt(command[2])) {
                        if (command[1].equals("first")) {
                            for (int j = 0; j < Integer.parseInt(command[2]); j++) {
                                coffeeList.remove(0);
                            }
                        }else {
                            for (int j = 0; j <Integer.parseInt(command[2]); j++) {
                                coffeeList.remove(coffeeList.size()-1);
                            }
                        }
                    }
                    break;
                case "Prefer":
                    if(coffeeList.size()-1>Integer.parseInt(command[2])){
                        Collections.swap(coffeeList,Integer.parseInt(command[1]),Integer.parseInt(command[2]));
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;
            }
        }
        System.out.println("Coffees:");
        System.out.println(coffeeList.toString().replaceAll("[\\[\\],]",""));
    }
}
