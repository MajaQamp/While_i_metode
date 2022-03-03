//Modifikujte petlju da trazi znak za artimeticku operaciju  i radi artimeticke operacije i daje ispis shodno operaciji.
//        ie.
//        Which operation would you like to use: *,/,+,-?
//        -
//        Please enter integer:
//        5
//        Difference of 0 and -5 is -5



import java.util.Scanner;

public class Task_1d_i1e {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int noviBroj = 0;
        int pocetniBroj = 0;
        char optionYN = '\u0000';
        char operators = '\u0000';



        do {
            System.out.println("Which operation would you like to use? Please choose one of the following operations: * / + -");
            operators = reader.next().charAt(0);


            System.out.println("Please enter the first number:" );
            pocetniBroj=reader.nextInt();

            System.out.println("Please enter the second number: ");
            noviBroj=reader.nextInt();

            if (operators=='+') {

                System.out.println("The sum of " + pocetniBroj + " and " + noviBroj + " is: " + (pocetniBroj + noviBroj));
            } else if (operators=='-') {

                System.out.println("The difference between " + pocetniBroj + " and " + noviBroj + " is: " + (pocetniBroj - noviBroj));
            } else if (operators=='*') {

                System.out.println("The total of " + pocetniBroj + " multiplied by " + noviBroj + " is: " + (pocetniBroj * noviBroj));
            } else if (operators=='/') {

                System.out.println("The total of " + pocetniBroj + " divided by " + noviBroj + " is: " + (pocetniBroj / noviBroj));

            }
            System.out.println("\nDo you want to start again? (y/n)");
            optionYN = reader.next().charAt(0);

        }

        while (optionYN == 'y');







    }
}
