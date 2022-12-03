package BasicSyntax;
import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lostGames=Integer.parseInt(scanner.nextLine());
        double headsetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice=Double.parseDouble(scanner.nextLine());
        double keyboardPrice=Double.parseDouble(scanner.nextLine());
        double displayPrice=Double.parseDouble(scanner.nextLine());
        double headset=0,mouse=0,keyboard=0,display=0;
        for (int i = 1; i <= lostGames; i++) {
            if(i%2==0){
                headset++;
            }
            if(i%3==0){
                mouse++;
            }
            if(i%6==0){
                keyboard++;
            }
            if(i%12==0) {
                display++;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.",headset*headsetPrice+
                mouse*mousePrice+keyboardPrice*keyboard+display*displayPrice);
    }
}