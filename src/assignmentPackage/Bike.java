package assignmentPackage;

import java.util.Scanner;

public class Bike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Gear: ");
        int gear = scanner.nextInt();
        int speed = 1;
        speed = gear + speed;
        if (gear > 20){
            System.out.println("Gear can't be incremented more than One Gear");
        }
        else {  System.out.println("Your Gear Has Been Incremented By One Gear " + speed);}
        /*while(speed < 2){
            System.out.println("Your Gear has been Incremented" + (speed));
            speed++;
        }*/
    }
}
