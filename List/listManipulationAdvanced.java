package List;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList=Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input=scanner.nextLine();
        while (!input.equals("end")){
            String[] command=input.split(" ");
            switch (command[0]) {
                case "Contains":
                    boolean contains = false;
                    for (int i = 0; i < numList.size(); i++) {
                        int num = Integer.parseInt(command[1]);
                        if (num == numList.get(i))
                            contains = true;
                    }
                    if (contains)
                        System.out.println("Yes");
                    else
                        System.out.println("No such number");
                    break;
                case "Print":
                    if (command[1].equals("even")) {
                        for (int num : numList) {
                            if (num % 2 == 0)
                                System.out.print(num + " ");
                        }
                        System.out.println();
                    } else {
                        for (int num : numList) {
                            if (num % 2 != 0)
                                System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int num : numList) {
                        sum += num;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int number=Integer.parseInt(command[2]);
                    switch (command[1]){
                        case "<":
                            for (int num:numList) {
                                if(num<number)
                                    System.out.print(num+" ");
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int num:numList) {
                                if(num>number)
                                    System.out.print(num+" ");
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int num:numList) {
                                if(num>=number)
                                    System.out.print(num+" ");
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int num:numList) {
                                if(num<=number)
                                    System.out.print(num+" ");
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }

            input=scanner.nextLine();
        }
    }
}
