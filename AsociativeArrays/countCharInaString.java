package AsociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharInaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine().replaceAll("\\s+","");
        Map<Character, Integer> symbolsCount= new LinkedHashMap<>();

        for (char symbol:text.toCharArray()) {
            symbolsCount.putIfAbsent(symbol,0);
            symbolsCount.put(symbol,symbolsCount.get(symbol)+1);
        }
        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            System.out.printf("%c -> %d\n",entry.getKey(), entry.getValue());
        }


    }
}
