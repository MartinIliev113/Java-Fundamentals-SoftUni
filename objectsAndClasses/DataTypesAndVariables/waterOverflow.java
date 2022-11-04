package DataTypesAndVariables;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tank=0;
        int capacity=255;
        int times=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <times ; i++) {
            int litters=Integer.parseInt(scanner.nextLine());
            if(litters>capacity)
                System.out.println("Insufficient capacity!");
            else {
                tank += litters;
                capacity -= litters;
            }
        }
        System.out.println(tank);
    }
}
