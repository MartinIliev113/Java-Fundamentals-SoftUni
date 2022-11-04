package Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int wagon[] = new int[n];
        int sum=0;

        for (int i = 0; i <wagon.length ; i++) {
            wagon[i]=Integer.parseInt(scanner.nextLine());
        }
        for (int elem:wagon) {
            sum+=elem;
        }
        for(int elem:wagon){
            System.out.print(elem+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
