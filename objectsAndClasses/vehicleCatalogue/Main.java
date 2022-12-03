package ObjectsAndClasses.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        List<Vehicle> vehicleList=new ArrayList<>();
        while (!input.equals("End")){
            String type;
            if(input.split(" ")[0].equals("car"))
                type="Car";
            else
                type="Truck";
            Vehicle vehicle=new Vehicle(type,input.split(" ")[1],input.split(" ")[2],
            Integer.parseInt(input.split(" ")[3]));
            vehicleList.add(vehicle);
            input=scanner.nextLine();
        }
        input=scanner.nextLine();
        while (!input.equals("Close the Catalogue")){
            for (Vehicle vehicle:vehicleList) {
                if(vehicle.getModel().equals(input)){
                    System.out.printf("Type: %s\n",vehicle.getType());
                    System.out.printf("Model: %s\n",vehicle.getModel());
                    System.out.printf("Color: %s\n",vehicle.getColor());
                    System.out.printf("Horsepower: %d\n",vehicle.getHorsePower());
                }
            }
            input=scanner.nextLine();
        }
        double truckHorsepower=0,truckCount=0;
        double carHorsepower=0,carCount=0;
        for (Vehicle vehicle:vehicleList) {
            if(vehicle.getType().equals("Truck")){
                truckHorsepower+=vehicle.getHorsePower();
                truckCount++;
            }else {
                carHorsepower+=vehicle.getHorsePower();
                carCount++;
            }
        }
        double carAverage=carHorsepower/carCount;
        double truckAverage=truckHorsepower/truckCount;
        if(carCount==0)
            carAverage=0;
        if(truckCount==0)
            truckAverage=0;
        System.out.printf("Cars have average horsepower of: %.2f.\n",carAverage);
        System.out.printf("Trucks have average horsepower of: %.2f.\n",truckAverage);

    }
}
