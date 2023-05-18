package classPackage;

import java.util.Scanner;
public class AccountDemoTest {
    public static void main(String...args){
       Scanner input = new Scanner(System.in);
        PersonalDemo myAccountDemo = new PersonalDemo();
        System.out.printf("Initial name is: %s%n%n", myAccountDemo.getName());
    }
}
