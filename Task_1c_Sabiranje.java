
//Modifikujte petlju da sabira prethodno upisan broj i novi broj i zatim ispise total
//        ukoliko nikakav broj nije deklarisan kao pocetni pocinje od broja 0 :
//        ie. Please enter integer:
//        4
//        Total of 0 and 4 is 4.


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task_1c_Sabiranje {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int noviBroj = 0;
        int pocetniBroj = 0;
        char optionYN = '\u0000';


        do {
            System.out.println("Please enter the first number:" );
            pocetniBroj=reader.nextInt();

            System.out.println("Please enter the second number: ");
            noviBroj=reader.nextInt();

            System.out.println("The total of " +pocetniBroj + " and " + noviBroj + " is: " + (pocetniBroj+noviBroj));

            System.out.println("Do you want to start again? (y/n)");
            optionYN = reader.next().charAt(0);

            }

        while (optionYN == 'y');







    }
}



