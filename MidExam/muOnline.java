package MidExam;

import java.util.Scanner;

public class muOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rooms=scanner.nextLine().split("\\|");
        int health=100, bitcoins=0;
        boolean isDead=false;
        for (int i = 0; i < rooms.length ; i++) {
            if(isDead)
                break;
            String[] command= rooms[i].split(" ");
            switch (command[0]){
                case "potion":
                    if(health+Integer.parseInt(command[1])<=100){
                        health=health+Integer.parseInt(command[1]);
                        System.out.printf("You healed for %d hp.\n",Integer.parseInt(command[1]));
                        System.out.printf("Current health: %d hp.\n",health);
                    }
                    else {
                        int oldhealth=health;
                        health=100;
                        System.out.printf("You healed for %d hp.\n",100-oldhealth);
                        System.out.printf("Current health: %d hp.\n",health);
                    }
                    break;
                case "chest":
                    int bitcoinsFound=Integer.parseInt(command[1]);
                    bitcoins+=bitcoinsFound;
                    System.out.printf("You found %d bitcoins.\n",bitcoinsFound);
                    break;
                default:
                    health-=Integer.parseInt(command[1]);
                    if(health>0){
                        System.out.printf("You slayed %s.\n",command[0]);
                    }
                    else {
                        System.out.printf("You died! Killed by %s.\n",command[0]);
                        System.out.printf("Best room: %d\n",i+1);
                        isDead=true;
                    }
                    break;
            }
        }
        if(!isDead){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n",bitcoins);
            System.out.printf("Health: %d\n",health);
        }
    }
}
