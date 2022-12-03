package BasicSyntax;

import java.util.Scanner;

public class messages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine()),digits=0;
        String output="";
        for (int i = 0; i <n ; i++) {
            int number=Integer.parseInt(scanner.nextLine());
            int numberIn=number;
            while (number>0){
                number/=10;
                digits++;
            }
            if (numberIn%10==2){
                switch (digits){
                    case 1:
                        output+='a';
                        break;
                    case 2:
                        output+="b";
                        break;
                    case 3:
                        output+="c";
                        break;
                }
            }else if(numberIn%10==3){
                switch (digits){
                    case 1:
                        output+='d';
                        break;
                    case 2:
                        output+="e";
                        break;
                    case 3:
                        output+="f";
                        break;
                }
            }else if(numberIn%10==4){
                switch (digits){
                    case 1:
                        output+='g';
                        break;
                    case 2:
                        output+="h";
                        break;
                    case 3:
                        output+="i";
                        break;
                }
            }else  if(numberIn%10==5){
                switch (digits){
                    case 1:
                        output+='j';
                        break;
                    case 2:
                        output+="k";
                        break;
                    case 3:
                        output+="l";
                        break;
                }
            }else  if(numberIn%10==6) {
                switch (digits) {
                    case 1:
                        output += 'm';
                        break;
                    case 2:
                        output += "n";
                        break;
                    case 3:
                        output += "o";
                        break;
                }
            }else  if(numberIn%10==7) {
                switch (digits) {
                    case 1:
                        output += 'p';
                        break;
                    case 2:
                        output += "q";
                        break;
                    case 3:
                        output += "r";
                        break;
                    case 4:
                        output += "s";
                        break;
                }
            }else  if(numberIn%10==8) {
                switch (digits) {
                    case 1:
                        output += 't';
                        break;
                    case 2:
                        output += "u";
                        break;
                    case 3:
                        output += "v";
                        break;
                }
            }else if(numberIn%10==9) {
                switch (digits) {
                    case 1:
                        output += 'w';
                        break;
                    case 2:
                        output += "x";
                        break;
                    case 3:
                        output += "y";
                        break;
                    case 4:
                        output += "z";
                        break;
                }
            }else if(numberIn%10==0){
                output+=" ";
            }
            digits=0;

        }
        System.out.println(output);
    }
}