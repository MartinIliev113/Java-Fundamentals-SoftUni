package List;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class cardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> handOne=Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List <Integer> handTwo=Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (handOne.size() !=0 && handTwo.size() !=0){
            int fistPlayerCard=handOne.get(0);
            int secondPlayerCard=handTwo.get(0);
            handOne.remove(0);
            handTwo.remove(0);
            if(fistPlayerCard>secondPlayerCard){
                handOne.add(fistPlayerCard);
                handOne.add(secondPlayerCard);
            }else if (secondPlayerCard >fistPlayerCard){
                handTwo.add(secondPlayerCard);
                handTwo.add(fistPlayerCard);
            }
        }
        if(handOne.size()==0){
            System.out.printf("Second player wins! Sum: %d",getSum(handTwo));
        }
        else{
            System.out.printf("First player wins! Sum: %d",getSum(handOne));
        }

    }
    private static int getSum(List<Integer> hand){
        int sum=0;
        for (int card:hand) {
            sum+=card;
        }
        return sum;
    }
}
