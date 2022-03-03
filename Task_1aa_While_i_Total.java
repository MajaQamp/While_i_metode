//Napravite petlju koja ce za svaki ukljucujuci i za pocetni broj traziti da unosite za svaki loop pozitivan broj.
//Ukoliko unesete negativan broj while petlja zavrsava.

import java.util.Scanner;

public class Task_1aa_While_i_Total {
    public static void main(String[] args) {
        int total = 2;

        while (total!=0) {
            System.out.println("Unesite pozitivan broj:");
            Scanner reader = new Scanner(System.in);
            total=reader.nextInt();
            if (total<0) {
                break;
            }
            }
        }


    }










