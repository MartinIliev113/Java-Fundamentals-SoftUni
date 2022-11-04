package List;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class softUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> schedule=Arrays.stream(scanner.nextLine().split(", "))
        .collect(Collectors.toList());
        String input=scanner.nextLine();
        while (!input.equals("course start")){
            String[] command=input.split(":");
            switch (command[0]){
                case "Add":
                    add(schedule,command);
                    break;
                case "Insert":
                    insert(schedule,command);
                    break;
                case "Remove":
                    remove(schedule,command);
                    break;
                case "Swap":
                    swap(schedule,command);
                    break;
                case "Exercise":
                    exercise(schedule,command);
            }

            input=scanner.nextLine();
        }
        for (int i = 0; i <schedule.size() ; i++) {
            System.out.printf("%d.%s\n",i+1,schedule.get(i));
        }
    }
    private static void add(List<String> lessons,String[] command){
        if(!lessons.contains(command[1])){
            lessons.add(command[1]);
        }
    }
    private  static void insert(List<String> lessons,String[] command){
        if(!lessons.contains(command[1])) {
            int index = Integer.parseInt(command[2]);
            lessons.add(index, command[1]);
        }
    }
    private static void remove(List<String> lessons,String[] command){
        if(lessons.contains(command[1])){
            int index=lessons.indexOf(command[1]);
            if(lessons.get(index+1).equals(command[1]+"-Exercise")){
                lessons.remove(index);
                lessons.remove(index+1);
            }
            else
                lessons.remove(index);
        }
    }
    private static void swap(List<String> lessons,String[] command){
        if(lessons.contains(command[1])&&lessons.contains(command[2])) {
            int indexFist = lessons.indexOf(command[1]);
            int indexSecond = lessons.indexOf(command[2]);
            if (lessons.get(indexFist + 1).equals(command[1] + "-Exercise")) {
                lessons.remove(indexFist + 1);
                lessons.set(indexSecond, command[1]);
                lessons.set(indexSecond + 1, command[1] + "-Exercise");
                lessons.set(indexFist, command[2]);
            } else if(indexSecond+1<lessons.size()){
                if (lessons.get(indexSecond + 1).equals(command[2] + "-Exercise")) {
                lessons.remove(indexSecond + 1);
                lessons.set(indexFist, command[2]);
                lessons.set(indexFist + 1, command[2] + "-Exercise");
                lessons.set(indexSecond, command[1]);
            }
            } else if (lessons.get(indexFist + 1).equals(command[1] + "-Exercise")
                    && lessons.get(indexSecond + 1).equals(command[2] + "-Exercise")) {
                lessons.remove(indexFist + 1);
                lessons.remove(indexSecond + 1);
                lessons.set(indexSecond, command[1]);
                lessons.set(indexSecond + 1, command[1] + "-Exercise");
                lessons.set(indexFist,command[2]);
                lessons.set(indexFist + 1, command[2] + "-Exercise");
            } else {
                lessons.set(indexSecond, command[1]);
                lessons.set(indexFist, command[2]);
            }
        }
    }
    private static void exercise(List<String> lessons,String[] command){
        if(lessons.contains(command[1]) && !lessons.contains(command[1]+"-Exercise")){
           int indexOfLesson=lessons.indexOf(command[1]);
           lessons.add(indexOfLesson+1,command[1]+"-Exercise");
        } else if (!lessons.contains(command[1])) {
            lessons.add(command[1]);
            lessons.add(command[1]+"-Exercise");
        }
    }
}
