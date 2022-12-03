package ExamPreparation;

import java.util.Scanner;

public class worldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] command = input.split(":");
            if (input.contains("Add")) {
                int index = Integer.parseInt(command[1]);
                if (stops.length() > index && index >= 0) {
                    stops = stops.insert(index, command[2]);
                }
                System.out.println(stops);
            } else if (input.contains("Remove")) {
                if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < stops.length()
                        && Integer.parseInt(command[2]) < stops.length()
                        && Integer.parseInt(command[2]) >= 0) {
                    stops = stops.delete(Integer.parseInt(command[1]), Integer.parseInt(command[2]) + 1);
                }
                System.out.println(stops);
            } else if (input.contains("Switch")) {
                String replaced = stops.toString().replace(command[1], command[2]);
                stops = stops.replace(0, stops.length(), replaced);
                System.out.println(stops);
            }
            input = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stops);
    }
}

