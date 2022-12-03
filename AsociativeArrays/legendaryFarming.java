package AsociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class legendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().toLowerCase().split(" ");
        Map<String, Integer> materialMap = new LinkedHashMap<>();
        int quantity = Integer.parseInt(input[0]);
        String material = input[1];
        materialMap.put("shards",0);
        materialMap.put("fragments",0);
        materialMap.put("motes",0);
        boolean shadowmourne = false, valanyr = false, dragonwrath = false;
        while (!shadowmourne||!valanyr||!dragonwrath) {
            for (int i = 0; i < input.length; i += 2) {
                quantity = Integer.parseInt(input[i]);
                material = input[i + 1];
                materialMap.putIfAbsent(material, 0);
                materialMap.put(material, materialMap.get(material) + quantity);
                if (materialMap.get("shards") >= 250) {
                    shadowmourne = true;
                    materialMap.put("shards", materialMap.get("shards") - 250);
                    break;
                } else if (materialMap.get("fragments") >= 250) {
                    valanyr = true;
                    materialMap.put("fragments", materialMap.get("fragments") - 250);
                    break;
                } else if (materialMap.get("motes") >= 250) {
                    dragonwrath = true;
                    materialMap.put("motes", materialMap.get("motes") - 250);
                    break;
                }
            }
            if(!shadowmourne&&!valanyr&&!dragonwrath)
                input=scanner.nextLine().split(" ");
            else
                break;
        }
        if (shadowmourne)
            System.out.println("Shadowmourne obtained!");
        else if (valanyr)
            System.out.println("Valanyr obtained!");
        else if (dragonwrath)
            System.out.println("Dragonwrath obtained!");
        for (Map.Entry<String, Integer> entry : materialMap.entrySet()) {
            if (entry.getKey().equals("shards"))
                System.out.printf("shards: %d\n", entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : materialMap.entrySet()) {
            if (entry.getKey().equals("fragments"))
                System.out.printf("fragments: %d\n", entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : materialMap.entrySet()) {
            if (entry.getKey().equals("motes"))
                System.out.printf("motes: %d\n", entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : materialMap.entrySet()) {
            if(!entry.getKey().equals("shards") && !entry.getKey().equals("fragments")
                    && !entry.getKey().equals("motes")){
                System.out.printf("%s: %d\n",entry.getKey(),entry.getValue());
            }
        }


    }
}
