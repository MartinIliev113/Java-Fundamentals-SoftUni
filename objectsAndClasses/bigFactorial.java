package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class bigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        BigInteger resultBigNum=new BigInteger(String.valueOf(1));
        for (int i = 1; i <=n; i++) {
            resultBigNum=resultBigNum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(resultBigNum);
    }
}
