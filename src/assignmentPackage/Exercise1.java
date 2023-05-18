package assignmentPackage;

import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args){
    Scanner input = new Scanner( System.in );
    System.out.println ( "Enter your Name: ");
    String clientName = input.nextLine();
    System.out.println (" Welcome " + clientName );
    System.out.printf ( "%s%n%s%n%s%n%s%n", "Press 1 for English", "Press 2 for Yoruba", "Press 3 for Igbo", "Press 4 for Hausa" );
    System.out.println ("Please select an Option");
    Scanner option = new Scanner(System.in);
    int clientOption = option.nextInt();
    switch (clientOption){
        case 1 : System.out.println("Hello");
        break;
        case 2 :  System.out.println("Enle o");
        break;
        case 3 : System.out.println("Sannu");
        break;
        case 4 : System.out.println("Nno o");
        break;
        default: System.out.println("You have not entered a valid option");

    }
    }
}
