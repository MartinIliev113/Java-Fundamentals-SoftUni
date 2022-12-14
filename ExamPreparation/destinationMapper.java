package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class destinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String places=scanner.nextLine();
        String regex="([=|\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(places);
        int travelPoints=0;
        List<String>destinations=new ArrayList<>();
        while (matcher.find()){
            String destination=matcher.group("destination");
            travelPoints+=destination.length();
            destinations.add(destination);
        }
        System.out.println("Destinations: "+String.join(", ",destinations));
        System.out.println("Travel Points: "+travelPoints);
    }
}
