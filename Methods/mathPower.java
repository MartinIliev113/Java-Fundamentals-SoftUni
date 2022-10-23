package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        DecimalFormat df =new DecimalFormat("0.####");

        System.out.println(df.format(power(a,b)));

    }
    public static double power(double x,double y){
        double z=1;
        for (int i = 1; i <=y ; i++) {
            z*=x;
        }
        return z;
    }
}
