package List;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class bombNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers=Arrays.stream(scanner.nextLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
        String[] data = scanner.nextLine().split("\\s+");
        for (int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i)==Integer.parseInt(data[0])){
                numbers.remove(i);
                for (int j = 0; j < Integer.parseInt(data[1]) ; j++) {
                    numbers.remove(i+1);
                    numbers.remove(i-1);
                }
            }
        }
        int sum=0;

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));
            sum+=numbers.get(i);
        }

    }
}
