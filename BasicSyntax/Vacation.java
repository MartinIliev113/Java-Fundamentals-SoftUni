package BasicSyntax;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        String type=scanner.nextLine();
        String day=scanner.nextLine();
        double pricesingle=0;
        switch (day){
            case "Friday":
                switch (type) {
                    case "Students":
                        pricesingle=8.45;
                        break;
                    case "Business":
                        pricesingle=10.9;
                        break;
                    case "Regular":
                        pricesingle=15;
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        pricesingle=9.8;
                        break;
                    case "Business":
                        pricesingle=15.6;
                        break;
                    case "Regular":
                        pricesingle=20;
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        pricesingle=10.46;
                        break;
                    case "Business":
                        pricesingle=16;
                        break;
                    case "Regular":
                        pricesingle=22.5;
                        break;
                }
                break;
        }
        double totaprice=number*pricesingle;
        if(type.equals("Students") && number>=30){
            totaprice=totaprice-0.15*totaprice;
        }
        else if(type.equals("Business") && number>=100){
            totaprice=totaprice-10*pricesingle;
        }
        else if(type.equals("Regular") && number>=10 && number <=20){
            totaprice=totaprice-0.05*totaprice;
        }
        System.out.printf("Total price: %.2f",totaprice);
    }
}
