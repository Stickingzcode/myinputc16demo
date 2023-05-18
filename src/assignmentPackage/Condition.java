package assignmentPackage;

import java.util.Scanner;
public class Condition {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number == 6) {
            System.out.println("this value is equal to six");
        } else if (number < 6) {
            System.out.println("this value is less than to six");
        } else if (number > 6) {
            System.out.print("this value is greater than six");

        }
        while ( number > 7 ){
            System.out.print("Finite loop");
        }
    }

}
