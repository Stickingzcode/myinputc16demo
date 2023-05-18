package assignmentPackage;

import java.util.Scanner;
public class Circle {
    public static void main(String...args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of the radius of the circle: ");
    float radius = input.nextFloat();
    float circumference = (float) (2 * Math.PI * radius);
    float area = (float) (Math.PI * radius * radius);
    System.out.printf("The diameter of the circle of radius %fcm is: %fcm%n", radius, (radius * 2));
    System.out.printf("The circumference of the circle of radius %fcm is: %fcm%n", radius, circumference);
    System.out.printf("The Area of the circle of radius %fcm is: %fcm%n", radius, area);

    }
}
