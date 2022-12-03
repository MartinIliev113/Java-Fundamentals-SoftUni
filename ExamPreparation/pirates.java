package ExamPreparation;


import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        Map<String,Integer> populationMap = new LinkedHashMap<>();
        Map<String,Integer>goldMap = new LinkedHashMap<>();
        while (!input.equals("Sail")){
            String city=input.split("\\|\\|")[0];
            int population=Integer.parseInt(input.split("\\|\\|")[1]);
            int gold=Integer.parseInt(input.split("\\|\\|")[2]);
            if(!populationMap.containsKey(city)){
                populationMap.put(city,population);
                goldMap.put(city,gold);
            }else {
                populationMap.put(city,population+populationMap.get(city));
                goldMap.put(city,gold+goldMap.get(city));
            }
            input=scanner.nextLine();
        }
        input=scanner.nextLine();
        while (!input.equals("End")){
            if(input.contains("Plunder")){
                String town=input.split("=>")[1];
                int people=Integer.parseInt(input.split("=>")[2]);
                int gold=Integer.parseInt(input.split("=>")[3]);
                populationMap.put(town,populationMap.get(town)-people);
                goldMap.put(town,goldMap.get(town)-gold);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",town,gold,people);
                if(populationMap.get(town)==0||goldMap.get(town)==0){
                    populationMap.remove(town);
                    goldMap.remove(town);
                    System.out.printf("%s has been wiped off the map!\n",town);
                }
            } else if (input.contains("Prosper")) {
                String town=input.split("=>")[1];
                int gold=Integer.parseInt(input.split("=>")[2]);
                if(gold>0){
                    goldMap.put(town,goldMap.get(town)+gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n",gold,town,goldMap.get(town));
                }else {
                    System.out.println("Gold added cannot be a negative number!");
                }
            }
            input=scanner.nextLine();
        }
        goldMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> goldMap.put(x.getKey(), x.getValue()));
        if(goldMap.size()>0){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n",goldMap.size());
            for (Map.Entry<String, Integer> entry : goldMap.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",entry.getKey(),populationMap.get(entry.getKey()),entry.getValue());
            }
        }
    }
}
