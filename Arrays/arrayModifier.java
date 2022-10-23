package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String command=scanner.nextLine();
        while (!command.equals("end")){
            if(command.contains("swap")){
                int indexOne=Integer.parseInt(command.split(" ")[1]);
                int indexTwo=Integer.parseInt(command.split(" ")[2]);
                int temp=numbers[indexOne];
                numbers[indexOne]=numbers[indexTwo];
                numbers[indexTwo]=temp;
            }else if(command.contains("multiply")){
                int indexOne=Integer.parseInt(command.split(" ")[1]);
                int indexTwo=Integer.parseInt(command.split(" ")[2]);
                numbers[indexOne]=numbers[indexOne]*numbers[indexTwo];
            }else if(command.equals("decrease")){
                for (int i = 0; i <numbers.length ; i++) {
                    numbers[i]=numbers[i]-1;
                }
            }
            command=scanner.nextLine();
        }
        for (int i = 0; i <numbers.length ; i++) {
            if(i< numbers.length-1)
                System.out.print(numbers[i]+", ");
            else
                System.out.print(numbers[i]);
        }
    }
}
