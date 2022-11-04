package DataTypesAndVariables;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double maxVolume=0;
        String biggest="";

        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++) {
            String model=scanner.nextLine();
            double r=Double.parseDouble(scanner.nextLine());
            int h=Integer.parseInt(scanner.nextLine());
            double volume=Math.PI*r*r*h;
            if(volume>maxVolume){
                maxVolume=volume;
                biggest=model;
            }
        }
        System.out.println(biggest);
    }
}
