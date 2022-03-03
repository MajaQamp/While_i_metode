//Napravite petlju koja prima brojeve no ukoliko se posalje broj -1000 izadje iz petlje
//U konzoli neka se ispise “Please enter any integer” prije vaseg unosa broja.
//nakon sto unesete -1000 napisite poruku da je exit broj -1000 detektovan.


import java.util.Scanner;

public class Task_1b_Loop_minus_1000 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int broj = 0;

        System.out.println("Please enter any integer:" );


    while (broj!=-1000) {
        broj=reader.nextInt();

        if (broj==-1000) {
            System.out.println("The exit number -1000 has been detected!");
            break;
        }
    }
}
}
