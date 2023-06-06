package org.lessons.java.bank;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Scanner memoriaSmartphone = new Scanner(System.in);
        Scanner dimensioneTv = new Scanner(System.in);
        Scanner smartTv = new Scanner(System.in);
        Scanner coloreCuffie = new Scanner(System.in);
        Scanner wirelessCuffie = new Scanner(System.in);

        System.out.println("Ciao! premi 1 per comprare uno smartphone, 2 per una tv o premi 3 per delle cuffie.");

        int userChoice = s1.nextInt();

        switch (userChoice) {
            case 1:
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Input errato");
                break;

        }
    }
}
