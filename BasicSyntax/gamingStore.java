package BasicSyntax;

import java.util.Scanner;

public class gamingStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double pachki=Double.parseDouble(scanner.nextLine());
        double nachaloPachki=pachki;
        String gameName=scanner.nextLine();
        while (!gameName.equals("Game time")){{
            if (pachki<0){
                System.out.println("Out of money");
                break;
            }
                switch (gameName){
                    case "OutFall 4":
                        if (pachki<39.99)
                            System.out.println("Too expensive");
                        else {
                            pachki -= 39.99;
                            System.out.println("Bought OutFall 4");
                        }
                        break;
                    case "CS: OG":
                        if(pachki<15.99)
                            System.out.println("Too expensive");
                        else {
                            pachki -= 15.99;
                            System.out.println("Bought CS: OG");
                        }
                        break;
                    case "Zplinter Zell":
                            if(pachki<19.99)
                                System.out.println("Too expensive");
                            else {
                                pachki -= 19.99;
                                System.out.println("Bought Zplinter Zell");
                            }
                            break;
                    case "Honored 2":
                        if(pachki<59.99)
                            System.out.println("Too expensive");
                        else {
                            pachki -= 59.99;
                            System.out.println("Bought Honored 2");
                        }
                        break;
                    case "RoverWatch":
                        if(pachki<29.99)
                            System.out.println("Too expensive");
                        else {
                            pachki -= 29.99;
                            System.out.println("Bought RoverWatch");
                        }
                        break;
                    case "RoverWatch Origins Edition":
                            if(pachki<39.99)
                                System.out.println("Too expensive");
                            else {
                                pachki -= 39.99;
                                System.out.println("Bought RoverWatch Origins Edition");
                            }
                            break;
                    case "Game Time":
                        break;
                    default:
                        System.out.println("Not Found");
                        break;
                }
           gameName=scanner.nextLine();
            }
            if(gameName.equals("Game Time")){
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", nachaloPachki-pachki,pachki);
            }
        }


    }
}
