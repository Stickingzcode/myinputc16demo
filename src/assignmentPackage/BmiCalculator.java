package assignmentPackage;

import java.util.Scanner;
public class BmiCalculator {
    public static void main(String...args){
    Scanner input = new Scanner(System.in);
    System.out.println("Kindly enter your weight in Pounds: ");
    int user_weight = input.nextInt();
    System.out.println("Kindly enter your height in Inches: ");
    float user_height = input.nextFloat();
    System.out.printf("Your BMI is: %f%n", (user_weight * 703) / (user_height * 2));
    }
}
