package DataTypesAndVariables;

import java.util.Scanner;

public class snowBalls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int bestSnowballTime=0,bestsnowballQuality=0,bestsnowballSnow=0;
        double bestSnowballValue=0;
        for (int i = 0; i <n ; i++) {
            int snowballSnow=Integer.parseInt(scanner.nextLine());
            int snowballTime=Integer.parseInt(scanner.nextLine());
            int snowballQuality=Integer.parseInt(scanner.nextLine());
            double snowballValue= Math.pow(((double)snowballSnow/(double)snowballTime),snowballQuality);
            if(snowballValue>bestSnowballValue){
                bestSnowballValue=snowballValue;
                bestsnowballSnow=snowballSnow;
                bestsnowballQuality=snowballQuality;
                bestSnowballTime=snowballTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",bestsnowballSnow,bestSnowballTime,bestSnowballValue,bestsnowballQuality);

    }
}
