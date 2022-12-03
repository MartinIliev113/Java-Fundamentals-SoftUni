package ObjectsAndClasses.orderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        List<Person> personList=new ArrayList<>();
        while (!input.equals("End")){
            Person person=new Person(input.split(" ")[0],input.split(" ")[1],
                    Integer.parseInt(input.split(" ")[2]));
                    personList.add(person);
            input=scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person:personList) {
            System.out.println(person);
        }
    }
}
