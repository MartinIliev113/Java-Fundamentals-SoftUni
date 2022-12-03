package AsociativeArrays;

import java.util.*;

public class companyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> employeeMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];
            employeeMap.putIfAbsent(companyName,new ArrayList<>());
            List<String> ids=employeeMap.get(companyName);
            if(!ids.contains(id)){
                employeeMap.get(companyName).add(id);
                ids=employeeMap.get(companyName);
                employeeMap.put(companyName,ids);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String id:entry.getValue()) {
                System.out.printf("-- %s\n",id );
            }
        }

    }
}

