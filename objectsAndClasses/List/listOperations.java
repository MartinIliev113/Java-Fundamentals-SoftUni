package List;



import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(command[1]);
                    numbers.add(numToAdd);
                    break;
                case "Insert":
                    int numToIns = Integer.parseInt(command[1]);
                    int indexToIns = Integer.parseInt(command[2]);
                    if (isValidIndex(indexToIns, numbers))
                        numbers.add(indexToIns, numToIns);
                    else
                        System.out.println("Invalid index");
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(command[1]);
                    if (isValidIndex(indexToRemove, numbers))
                        numbers.remove(indexToRemove);
                    else
                        System.out.println("Invalid index");
                    break;
                case "Shift":
                    if (command[1].equals("left")) {
                        for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                            int firstNum = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstNum);
                        }
                    } else {
                        for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                            int lastNum = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastNum);
                        }
                    }
                    break;

            }
            input = scanner.nextLine();
        }
        for (int num:numbers) {
            System.out.print(num+" ");
        }
    }

    private static boolean isValidIndex(int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }

}

