package chapterSeven;

import java.util.Scanner;
public class ArrayMinMax {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        final int ARRAY_LENGTH = 5;
        int [] num = new int [ARRAY_LENGTH];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int collect = 0; collect < ARRAY_LENGTH; collect ++){
                   System.out.println("Enter a value");
                   num[collect] = input.nextInt();
                   if (num[collect] > max){
                       max = num[collect];

                   }
                   if (num[collect] < min) {
                       min = num[collect];

                       }
        }
        System.out.printf("the maximum number is: %d%n", max );
        System.out.printf("The minimum number is: %d%n", min);
        }
    int [] numbers = {5, 7, 8, 9, 12};

     public void findMaximumNumber(int maxNumber) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > maxNumber)
                maxNumber = numbers[index];
        }
    }
    public int[] getMaximumNumber(){
         return numbers;
    }
//     System.out.printf("The maximum number in this array is: %d%n", Arrays);
    }

