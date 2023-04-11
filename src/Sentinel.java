import java.util.Scanner;
public class Sentinel {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the sale price for your product or -1 to stop");
            int userInput = input.nextInt();
            int totalSales = 0;
            while (userInput != -1){
                totalSales += userInput;
                System.out.println("Enter the sale price for your product or -1 to stop");
                userInput = input.nextInt();
            }
            System.out.println("The total sales is: " + totalSales);
        }

}
