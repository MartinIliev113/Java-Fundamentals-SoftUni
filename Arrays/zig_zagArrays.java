package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class zig_zagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray =new int[n];
        for (int i = 0; i < n ; i++) {
            if((i+1)%2==0){
                secondArray[i] = Integer.parseInt(scanner.next());
                firstArray[i]=Integer.parseInt(scanner.next());;
            }else {
                firstArray[i] = Integer.parseInt(scanner.next());
                secondArray[i]=Integer.parseInt(scanner.next());
            }
        }
        for (int num:
             firstArray) {
            System.out.print(num+" ");
        }
        System.out.println();
        for (int num:
             secondArray) {
            System.out.print(num+" ");
        }
    }
}
