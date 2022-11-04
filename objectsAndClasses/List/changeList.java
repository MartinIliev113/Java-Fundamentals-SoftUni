package List;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Delete":
                    int numToDelete = Integer.parseInt(command[1]);
                    numbers.removeAll(Arrays.asList(numToDelete));
                    break;
                case "Insert":
                    int numToAdd = Integer.parseInt(command[1]);
                    int position = Integer.parseInt(command[2]);
                    numbers.add(position,numToAdd);
            }

            input = scanner.nextLine();
        }
        for (int num:numbers) {
            System.out.print(num+" ");
        }
    }
}
