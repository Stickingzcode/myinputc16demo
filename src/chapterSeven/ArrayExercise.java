package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayExercise {
    public static void main(String...args){
        int[] number = new int[4];
        number [0] = 12;
        number [1] = 34;
        number [2] = 22;
        number [3] = 321;
        System.out.println(Arrays.toString(number));

        int value [];
        value = new int[2];
        String [] names = new String[]{"Esther", "Kuli", "Sule", "Habib", "Bright", "oye", "lakeside", "latin"};
        System.out.println(names[0]);
        System.out.println(names.length);
        System.out.println(names[0].length());
        System.out.println(names [names.length - 1] );
        System.out.println(names [(names.length / 2 )-1]);

        int [] numbers = new int[50];
      for(int index = 0; index < numbers.length; index++){
          numbers[index] = 5;}
        System.out.println(Arrays.toString(numbers));

      int count = 0;
      while (count < 10){
      numbers[count] = 5;
      count += 1;
      System.out.println(Arrays.toString(numbers));}

      Scanner input = new Scanner(System.in);
      int [] userNumber = new int [5];
      int counter = 0;
      while (counter < userNumber.length){
      System.out.println("Enter a number: ");
      int userInput = input.nextInt();
      userNumber[counter] = userInput;
      counter += 1;
      }
      System.out.println(Arrays.toString(userNumber));
      int sum = 0;
      counter = 0;
      while (counter < userNumber.length){
           sum += userNumber[counter];
           counter++;
      }
      System.out.println(sum);
      System.out.printf("The sum of the arrays is: %d%n", userNumber[0] + userNumber[1] + userNumber[2] + userNumber[3] + userNumber[4]);

    }
}
