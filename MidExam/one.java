package MidExam;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double days=Double.parseDouble(scanner.nextLine());
        double playerCount=Double.parseDouble(scanner.nextLine());
        double groupEnergy=Double.parseDouble(scanner.nextLine());
        double waterForDay=Double.parseDouble(scanner.nextLine());
        double foodForDay=Double.parseDouble(scanner.nextLine());
        double totalWater=waterForDay*playerCount*days;
        double totalFood=foodForDay*playerCount*days;
        for (int i = 1; i <=days ; i++) {
            double energyLost=Double.parseDouble(scanner.nextLine());
            groupEnergy-=energyLost;
            if(groupEnergy<=0)
                break;
            if(i%2==0){
                groupEnergy+=0.05*groupEnergy;
                totalWater-=0.3*totalWater;
            }
            if(i%3==0){
                totalFood-=(totalFood/playerCount);
                groupEnergy+=0.1*groupEnergy;
            }

        }
        if(groupEnergy>0)
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",groupEnergy);
        else
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",totalFood,totalWater);
    }
}
