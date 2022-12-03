package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class needForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map <String,Integer> mileageMap=new LinkedHashMap<>();
        Map <String,Integer> fuelMap=new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String input=scanner.nextLine();
            String car=input.split("\\|")[0];
            int mileage=Integer.parseInt(input.split("\\|")[1]);
            int fuel=Integer.parseInt(input.split("\\|")[2]);
            mileageMap.put(car,mileage);
            fuelMap.put(car,fuel);
        }
        String input=scanner.nextLine();
        while (!input.equals("Stop")){
            String[] command=input.split(" : ");
            switch (command[0]){
                case "Drive":{
                    String car=command[1];
                    int distance=Integer.parseInt(command[2]);
                    int fuel=Integer.parseInt(command[3]);
                    if(fuelMap.get(car)<fuel){
                        System.out.println("Not enough fuel to make that ride");
                    } else  {
                        fuelMap.put(car, fuelMap.get(car)-fuel);
                        mileageMap.put(car,mileageMap.get(car)+distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",car,distance,fuel);
                    }
                    if(mileageMap.get(car)>=100_000){
                        System.out.printf("Time to sell the %s!\n",car);
                        mileageMap.remove(car);
                        fuelMap.remove(car);
                    }
                    break;
                }
                case "Refuel": {
                    String car = command[1];
                    int fuel = Integer.parseInt(command[2]);
                    if (fuel + fuelMap.get(car) > 75) {
                        System.out.printf("%s refueled with %d liters\n", car, 75 - fuelMap.get(car));
                        fuelMap.put(car, 75);
                    } else {
                        fuelMap.put(car, fuelMap.get(car) + fuel);
                        System.out.printf("%s refueled with %d liters\n", car, fuel);
                    }
                    break;
                }
                case "Revert":{
                    String car=command[1];
                    int kilometers=Integer.parseInt(command[2]);
                    if(mileageMap.get(car)-kilometers>=10_000){
                        mileageMap.put(car,mileageMap.get(car)-kilometers);
                        System.out.printf("%s mileage decreased by %d kilometers\n",car,kilometers);
                    }else
                    {
                        mileageMap.put(car,10000);
                    }
                    break;
                }
            }
            input=scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : fuelMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",entry.getKey(),
                    mileageMap.get(entry.getKey()),entry.getValue());
        }

    }
}
