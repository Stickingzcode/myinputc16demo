package myPackage;

import java.util.Scanner;
public class PersonalDemo {
    private String name;
    private int number;
   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
   public void setNumber(int number){
       this.number = number;
   }
   public int getNumber(){
       return number;
   }
   public static void main(String...args){
    Scanner input = new Scanner(System.in);
    PersonalDemo myAccountDemo = new PersonalDemo();
    PersonalDemo myAccountNumber = new PersonalDemo();
    System.out.printf("Initial name is: %s%n%n", myAccountDemo.getName());
    System.out.println("Please enter a name: ");
    System.out.println("Please enter your phone number");
    String theName = input.nextLine();
    int userNumber = input.nextInt();
    myAccountNumber.setNumber(userNumber);
    myAccountDemo.setName(theName);
    System.out.println();
    System.out.printf("Name in object myAccountDemo is:%n%s%n", myAccountDemo.getName());
    System.out.println();
    System.out.printf("The number in myAccountNumber is:%n%s%n", myAccountNumber.getNumber());
   }
}
