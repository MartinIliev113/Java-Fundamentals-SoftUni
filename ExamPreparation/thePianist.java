package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class thePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> composerMap = new LinkedHashMap<>();
        Map<String, String> keyMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] token = input.split("\\|");
            composerMap.put(token[0], token[1]);
            keyMap.put(token[0], token[2]);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] command = input.split("\\|");
            String piece = command[1];
            switch (command[0]) {
                case "Add":
                    if (!composerMap.containsKey(piece) && !keyMap.containsKey(piece)) {
                        composerMap.put(piece,command[2]);
                        keyMap.put(piece,command[3]);
                        System.out.printf("%s by %s in %s added to the collection!\n",piece,command[2],command[3]);
                    }else
                        System.out.printf("%s is already in the collection!\n",piece);
                    break;
                case "Remove":
                    if (composerMap.containsKey(piece) && keyMap.containsKey(piece)){
                        composerMap.remove(piece);
                        keyMap.remove(piece);
                        System.out.printf("Successfully removed %s!\n",piece);
                    }else
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",piece);
                    break;
                case "ChangeKey":
                    if(keyMap.containsKey(piece)){
                        keyMap.put(piece,command[2]);
                        System.out.printf("Changed the key of %s to %s!\n",piece,command[2]);
                    }else
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",piece);
                    break;
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : keyMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s\n",entry.getKey(),composerMap.get(entry.getKey()),entry.getValue());
        }

    }
}
