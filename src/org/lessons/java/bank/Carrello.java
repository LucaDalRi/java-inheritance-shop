package org.lessons.java.bank;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        boolean flag = true;

        System.out.println("Quanti oggetti vuoi acquistare?");

        int userQuantity = s1.nextInt();

        int counter = 0;

        do {

            Prodotto[] carrello = new Prodotto[userQuantity];

            System.out.println("Premi 1 per comprare uno smartphone, 2 per una tv oppure 3 per delle cuffie.");

            int userChoice = s1.nextInt();

            Prodotto nuovoProdotto;

            if (userChoice > 0 && userChoice < 4) {
                System.out.println("Inserisci il nome");

                String prodName = s1.next();

                System.out.println("Inserisci la descrizione");

                String prodDesc = s1.next();

                System.out.println("Inserisci il prezzo");

                double prodPrice = s1.nextInt();

                System.out.println("Inserisci le tasse");

                int prodTax = s1.nextInt();

                nuovoProdotto = new Prodotto(prodName, prodDesc, prodPrice, prodTax);

            } else {
                System.out.println("Input errato!");
                break;
            }

            switch (userChoice) {
                case 1:
                    System.out.println("Inserisci il codice Imei.");
                    int userImei = s1.nextInt();
                    System.out.println("Inserisci quanti Gb di memoria vuoi.");
                    int userGb = s1.nextInt();
                    nuovoProdotto = new Smartphone(nuovoProdotto, userImei, userGb);
                    counter++;
                    carrello[counter - 1] = nuovoProdotto;
                    break;
                case 2:
                    System.out.println("Inserisci i pollici del televisore");
                    int userScreenSize = s1.nextInt();
                    System.out.println("La tv è smart? inserisci s oppure n");
                    boolean userIsSmart = s1.next().equalsIgnoreCase("s");
                    nuovoProdotto = new Televisori(nuovoProdotto, userScreenSize, userIsSmart);
                    counter++;
                    carrello[counter - 1] = nuovoProdotto;
                    break;
                case 3:
                    System.out.println("Inserisci il colore delle cuffie");
                    String userColor = s1.next();
                    System.out.println("Le cuffie sono wireless? inserisci s oppure n");
                    boolean userIsWireless = s1.next().equalsIgnoreCase("s");
                    nuovoProdotto = new Cuffie(nuovoProdotto, userColor, userIsWireless);
                    counter++;
                    carrello[counter - 1] = nuovoProdotto;
                    break;
                default:
                    System.out.println("Input errato");
                    break;
            }

            if (userQuantity == counter) {

                System.out.println(Arrays.toString(carrello));

                System.out.println("Grazie per gli acquisti!");

                flag = false;
            }
        }
        while (flag);
    }
}
