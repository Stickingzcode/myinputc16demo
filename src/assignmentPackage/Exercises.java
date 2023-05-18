package assignmentPackage;

import java.util.Scanner;
public class Exercises {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

             int sum = 0;
             int counter = 0;
             int numberOfEvent = 0;
             while( counter >= 0 && counter <= 100 ) {
                 System.out.println ("Enter a number: ");
                 int number = input.nextInt();
                 sum += number;
                 counter++;
                 numberOfEvent = numberOfEvent + 1;

             }
        System.out.println ("The total is: " + sum);
        int mean = sum / numberOfEvent;

        System.out.println ("The average is: " + mean );

        //Scanner scanner  = new Scanner(System.in);


       /* int sales;

        int totalSales = 0;

        int counter = 0;

        while ( counter < 5 ){
            System.out.println("Enter sale for product: " + ( counter ));
            sales = scanner.nextInt();
            totalSales+= sales;
            counter ++;
            System.out.println("counter is no " + counter);
            System.out.println("sales is now " + sales);
            System.out.println("total sales is now " + totalSales);
            System.out.println("\n");

        }*/
        }

    class Weather {
        public String checkWeatherCondition(String weatherCondition){
            switch(weatherCondition){
                case "sunnyday":{
                    System.out.println("Put on Sunshades");
                }
                case "windyday":{
                    System.out.println("Put on Jacket");
                }
                case "rainyday":{
                    System.out.println("Put on Umbrella");
                }
                case "snowday":{
                    System.out.println("Stay at home");
                }
                default: return "";
            }
        }
    }
}
