package ObjectsAndClasses.opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Person> personList=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String data=scanner.nextLine();
            Person person=new Person(data.split(" ")[0],Integer.parseInt(data.split(" ")[1]));
            personList.add(person);
        }
        for (Person person:personList) {
            if(person.getAge()>30){
                System.out.printf("%s - %d\n",person.getName(),person.getAge());
            }
        }
    }
}
