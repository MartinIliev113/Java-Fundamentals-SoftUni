package BasicSyntax;
import java.util.Scanner;

public class padawan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double money=Double.parseDouble(scanner.nextLine());
        int students=Integer.parseInt(scanner.nextLine());
        double lightsaberPrice=Double.parseDouble(scanner.nextLine());
        double robePrice=Double.parseDouble(scanner.nextLine());
        double beltPrice=Double.parseDouble(scanner.nextLine());

        double lightsaber=Math.ceil(students+0.1*students);
        double belt=students-students/6;
        double totalMoney=lightsaber*lightsaberPrice+
                students*robePrice+belt*beltPrice;

        if(totalMoney<=money){
            System.out.printf("The money is enough - it would cost %.2flv.",totalMoney);
        }else
            System.out.printf("George Lucas will need %.2flv more.",totalMoney-money);
    }
}