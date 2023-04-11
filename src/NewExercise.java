import java.util.Scanner;

public class NewExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int numberOfEvent = 0;
        int counter = 0;

        while ( counter < 5 ) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if ( number >= 0 && number <= 100) {
                sum += number;
                counter++;
                numberOfEvent = numberOfEvent + 1;
            }
        }
        System.out.println("The total is: " + sum);
        int mean = sum / numberOfEvent;

        System.out.println("The average is: " + mean);

    }
}
