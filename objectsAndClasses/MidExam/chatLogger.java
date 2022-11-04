package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chat = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Chat":
                    chat.add(command[1]);
                    break;
                case "Delete":
                    chat.remove(command[1]);
                    break;
                case "Edit":
                    if (chat.contains(command[1])) {
                        int index = chat.indexOf(command[1]);
                        chat.remove(index);
                        chat.add(index, command[2]);
                    }
                    break;
                case "Pin":
                    if (chat.contains(command[1])) {
                        int i = chat.indexOf(command[1]);
                        chat.remove(i);
                        chat.add(chat.size(), command[1]);
                    }
                    break;
                case "Spam":
                    int messages=command.length;
                    for (int i = 1; i < messages; i++) {
                        chat.add(command[i]);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (String elem:chat) {
            System.out.println(elem);
        }

    }
}
