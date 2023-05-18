package classPackage;

import java.util.Scanner;
public class  Account {
    private String name;
    private double balance;

    public Account (String name, double balance){
        this.name = name;
        if (balance > 0.0){
            this.balance = balance;
        }
    }
public void deposit(double depositAmount){
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
}
public void withdrawal(double withdrawalAmount){
        if (withdrawalAmount > balance) {
            balance = balance;
            System.out.println("Oops! The intended withdrawal amount is greater than your balance.");
        }
        else balance = balance - withdrawalAmount;
}
public double getBalance(){
        return balance;
}
    public void setName(String name) {
      this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void main(String...args){
        Account herAccount = new Account ("Vickie Sticks", 150.00);
        Account hisAccount = new Account ("Jonathan Grey", 0.00);
        System.out.printf("The newest classPackage.Account owner is: %s%n", herAccount.getName());
        System.out.printf("Your initial balance is: %.2f%n", herAccount.getBalance());
        System.out.printf("Your classPackage.Account name is: %s%n and your balance is: %.2f%n", hisAccount.getName(), hisAccount.getBalance());
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you wanna deposit: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %,.2f to herAccount balance%n", depositAmount);
        herAccount.deposit(depositAmount);
        System.out.printf("%n %s's new account balance is: %,.2f%n", herAccount.getName(), herAccount.getBalance() );
        System.out.println("How much do you wanna withdraw?");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("removing the intended amount %,.3f from your balance: ", withdrawalAmount);
        herAccount.withdrawal(withdrawalAmount);
        System.out.printf("%nYour new balance after withdrawal is: %,.2f", herAccount.getBalance());
    }
}
