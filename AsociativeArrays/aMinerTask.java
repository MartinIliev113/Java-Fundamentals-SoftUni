package AsociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        Map<String,Integer> minerMap=new LinkedHashMap<>();
        while (!input.equals("stop")){
            String resource=input;
            int quantity=Integer.parseInt(scanner.nextLine());;
            minerMap.putIfAbsent(resource,0);
            minerMap.put(resource,minerMap.get(resource)+quantity);
            input=scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : minerMap.entrySet()) {
            System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue());
        }

    }
}
