package AsociativeArrays;

import java.util.*;

public class courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courseMap=new LinkedHashMap<>();
        String input=scanner.nextLine();
        while (!input.equals("end")){
            String courseName=input.split(" : ")[0];
            String studentName=input.split(" : ")[1];
            courseMap.putIfAbsent(courseName,new ArrayList<>());
            List<String> students=courseMap.get(courseName);
            students.add(studentName);
            courseMap.put(courseName,students);
            input=scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courseMap.entrySet()) {
            System.out.printf("%s: %d\n",entry.getKey(),entry.getValue().size());
            for (String student: entry.getValue()) {
                System.out.printf("-- %s\n",student);
            }
        }
    }
}
