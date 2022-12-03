package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List <String> people=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            String command=scanner.nextLine();
            if(command.contains("not")) {
                if (people.contains(command.split(" ")[0])) {
                    people.remove(command.split(" ")[0]);
                } else {
                    System.out.printf("%s is not in the list!\n", command.split(" ")[0]);
                }
            }
            else {
                if(!people.contains(command.split(" ")[0])){
                    people.add(command.split(" ")[0]);
                }
                else {
                    System.out.printf("%s is already in the list!\n",command.split(" ")[0]);
                }
            }
        }
        for (String guest:people) {
            System.out.println(guest);
        }
    }
}

