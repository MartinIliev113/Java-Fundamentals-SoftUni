package AsociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class wordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(!wordsMap.containsKey(word)){
                wordsMap.put(word,new ArrayList<>());
            }
            wordsMap.get(word).add(synonym);

        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s\n",entry.getKey(),String.join(", ", entry.getValue()));
        }

    }
}
