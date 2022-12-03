package AsociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,String> licencePlateMap=new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String input=scanner.nextLine();
            String command=input.split(" ")[0];
            String userName=input.split(" ")[1];
            if(command.equals("register")){
                String licensePlate=input.split(" ")[2];
                if(licencePlateMap.containsKey(userName)){
                    System.out.printf("ERROR: already registered with plate number %s\n",licencePlateMap.get(userName));
                }
                else{
                    licencePlateMap.put(userName,licensePlate);
                    System.out.printf("%s registered %s successfully\n",userName,licensePlate);
                }
            }
            else {
                if(!licencePlateMap.containsKey(userName))
                    System.out.printf("ERROR: user %s not found\n",userName);
                else{
                    licencePlateMap.remove(userName);
                    System.out.printf("%s unregistered successfully\n",userName);
                }
            }
        }
        for (Map.Entry<String, String> entry : licencePlateMap.entrySet()) {
            System.out.printf("%s => %s\n",entry.getKey(),entry.getValue());
        }

    }
}
