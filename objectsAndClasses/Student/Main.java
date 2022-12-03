package ObjectsAndClasses.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Student> studentList=new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String data=scanner.nextLine();
            Student student=new Student(data.split(" ")[0],data.split(" ")[1],Double.parseDouble(data.split(" ")[2]));
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student:studentList) {
            System.out.println(student);
        }
    }
}
