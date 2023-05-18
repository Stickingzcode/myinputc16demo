package chapterSeven;

import java.util.Arrays;

import java.util.Scanner;
public class MultidimensionalArray {
    public static void main(String...args){
    int [][] reference = new int [6][];
    reference [0] = new int []{1, 3, 5, 7};
    reference [1] = new int [4];// even numbers
    reference [2] = new int []{34, 45, 6, 7, 8};
    reference [3] = new int [5]; //fibonacci sequence
    reference [4] = new int [4];
        int userNumber;
        for (int index = 0; index < reference[1].length; index++){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter even numbers only: ");
            userNumber = userInput.nextInt();
            if (userNumber % 2 == 0) reference[1][index] = userNumber;
            else System.out.println("You have entered an invalid number! ");
        }
            System.out.println(Arrays.deepToString(reference));
            int number;
//            for (int index = 0; index < reference[4].length; ){
//                Scanner userValue = new Scanner(System.in);
//                System.out.println("input a value: ");
//                number = userValue.nextInt();
//                if (number % 2 == 0)
//                {reference[4][index] = number;
//                else {System.out.println("your value is not divisible by 2!");
//                System.out.println("Enter another value: ");}
//                number = userValue.nextInt();
//                }
//                index++;
//            }
    }
}