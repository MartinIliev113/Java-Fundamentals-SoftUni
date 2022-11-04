package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class students {
    static class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName,String lastName,int age,String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town=town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        List<Student> studentsList=new ArrayList<>();
        while (!input.equals("end")){
            String[] command=input.split(" ");
            Student currentStudent= new Student(command[0],command[1],Integer.parseInt(command[2]),command[3]);
            studentsList.add(currentStudent);
            input=scanner.nextLine();
        }
        String city=scanner.nextLine();
        for (Student student:studentsList) {
            if(city.equals(student.getTown())){
                System.out.printf("%s %s is %d years old\n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }
    }
}
