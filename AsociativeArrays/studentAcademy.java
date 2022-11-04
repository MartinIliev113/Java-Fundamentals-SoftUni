package AsociativeArrays;

import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsMap=new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String name=scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());
            if(!studentsMap.containsKey(name)){
                studentsMap.put(name,new ArrayList<>());
            }
            studentsMap.get(name).add(grade);
        }
        Map<String,Double> averageGrade=new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry: studentsMap.entrySet()) {
            List<Double> listGrades = entry.getValue();
            double average=getAverageGrade(listGrades);
            if(average>=4.5){
                averageGrade.put(entry.getKey(),average);
            }
        }
        averageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue()));

    }
    private static double getAverageGrade(List<Double> listGrades){
        double sum=0;
        for (double grade: listGrades) {
            sum+=grade;
        }
        return sum/listGrades.size();
    }
}
