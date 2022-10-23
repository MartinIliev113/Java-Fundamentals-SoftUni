package List;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> wagonsList=Arrays.stream(scanner.nextLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
        int capacity=Integer.parseInt(scanner.nextLine());
        String command=scanner.nextLine();
        while(!command.equals("end")){
            String[] commandPart=command.split(" ");
            if(commandPart[0].equals("Add")){
                wagonsList.add(Integer.parseInt(commandPart[1]));
            }
            else {
                int passengers=Integer.parseInt(commandPart[0]);
                for (int i = 0; i <wagonsList.size() ; i++) {
                    if(wagonsList.get(i)+passengers<=capacity)
                    {
                        int wagon=wagonsList.get(i)+passengers;
                        wagonsList.set(i,wagon);
                        break;
                    }
                }
            }

            command=scanner.nextLine();
        }
        for (int wagon:wagonsList) {
            System.out.print(wagon+" ");
        }
    }
}
