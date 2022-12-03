package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class heroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Double> hpMap=new LinkedHashMap<>();
        Map<String,Double> mpMap=new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String input=scanner.nextLine();
            String name=input.split(" ")[0];
            Double hp=Double.parseDouble(input.split(" ")[1]);
            Double mp=Double.parseDouble(input.split(" ")[2]);
            if(hp<=100)
                hpMap.put(name,hp);
            if(mp<=200)
                mpMap.put(name,mp);
        }
        String command=scanner.nextLine();
        while (!command.equals("End")){
            if(command.contains("CastSpell")){
                String name=command.split(" - ")[1];
                Double mpNeeded=Double.parseDouble(command.split(" - ")[2]);
                String spell=command.split(" - ")[3];
                if(mpMap.get(name)>=mpNeeded){
                    mpMap.put(name,mpMap.get(name)-mpNeeded);
                    System.out.printf("%s has successfully cast %s and now has %.0f MP!\n",name,spell,mpMap.get(name));
                }else
                    System.out.printf("%s does not have enough MP to cast %s!\n",name,spell);
            } else if (command.contains("TakeDamage")) {
                String name=command.split(" - ")[1];
                Double damage=Double.parseDouble(command.split(" - ")[2]);
                String attacker=command.split(" - ")[3];
                if(hpMap.get(name)-damage>0){
                    hpMap.put(name, hpMap.get(name)-damage);
                    System.out.printf("%s was hit for %.0f HP by %s and now has %.0f HP left!\n",name,damage,attacker,hpMap.get(name));
                }else {
                    hpMap.remove(name);
                    mpMap.remove(name);
                    System.out.printf("%s has been killed by %s!\n",name,attacker);
                }
            } else if (command.contains("Recharge")) {
                String name=command.split(" - ")[1];
                Double amount=Double.parseDouble(command.split(" - ")[2]);
                if(mpMap.get(name)+amount<200){
                    mpMap.put(name,mpMap.get(name)+amount);
                    System.out.printf("%s recharged for %.0f MP!\n",name,amount);
                }else {
                    System.out.printf("%s recharged for %.0f MP!\n",name,200-mpMap.get(name));
                    mpMap.put(name,200.0);
                }
            } else if (command.contains("Heal")) {
                String name=command.split(" - ")[1];
                Double amount=Double.parseDouble(command.split(" - ")[2]);
                if(hpMap.get(name)+amount<100){
                    hpMap.put(name,hpMap.get(name)+amount);
                    System.out.printf("%s healed for %.0f HP!\n",name,amount);
                }else {
                    System.out.printf("%s healed for %.0f HP!\n",name,100-hpMap.get(name));
                    hpMap.put(name,100.0);
                }
            }
            command=scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : hpMap.entrySet()) {
            System.out.printf("%s\n",entry.getKey());
            System.out.printf("  HP: %.0f\n",entry.getValue());
            System.out.printf("  MP: %.0f\n",mpMap.get(entry.getKey()));
        }
    }
}
