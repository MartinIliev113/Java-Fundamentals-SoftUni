package BasicSyntax;

import java.util.Scanner;

public class vendigMachine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String coin=scanner.nextLine();
        double totalmoney=0;
        while(!coin.equals("Start")){
            double coinIncererted=Double.parseDouble(coin);
            if(coinIncererted==0.1||coinIncererted==0.2||coinIncererted==0.5
            ||coinIncererted==1||coinIncererted==2)
                totalmoney+=coinIncererted;
            else
                System.out.printf("Cannot accept %.2f",coinIncererted);
                System.out.println();
            coin=scanner.nextLine();
        }
        String product=scanner.nextLine();
        while (!product.equals("End")){
            switch (product){
                case "Nuts":
                    if(totalmoney<2){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    else {
                        System.out.println("Purchased Nuts");
                        totalmoney-=2;
                    }
                    break;
                case "Water":
                    if(totalmoney<0.7){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    else {
                        System.out.println("Purchased Water");
                        totalmoney-=0.7;
                    }
                    break;
                case "Crisps":
                    if(totalmoney<1.5){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    else{
                        System.out.println("Purchased Crisps");
                        totalmoney-=1.5;
                    }
                    break;
                case "Soda":
                    if(totalmoney<0.8){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    else{
                        System.out.println("Purchased Soda");
                        totalmoney-=0.8;
                    }
                    break;
                case "Coke":
                    if(totalmoney<1){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    else{
                        System.out.println("Purchased Coke");
                        totalmoney-=1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product=scanner.nextLine();
        }
        System.out.printf("Change: %.2f",totalmoney);
    }
}
