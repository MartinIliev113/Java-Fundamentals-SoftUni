package DataTypesAndVariables;

import java.util.Scanner;

public class primeChecker {
    public static void main(String[] args) {
        Scanner chetec = new Scanner(System.in);
        int ___Do___ = Integer.parseInt(chetec.nextLine());

        for (int takoa = 2; takoa <= ___Do___; takoa++) {

            boolean takovalie = true;

            for (int cepitel = 2; cepitel < takoa; cepitel++) {

                if (takoa % cepitel == 0) {

                    takovalie = false;

                    break;

                }

            }

            System.out.printf("%d -> %b%n", takoa, takovalie);

        }
        }
    }

