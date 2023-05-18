package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String...args){
        int [] scores = new int [5];
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < scores.length; index++){
            System.out.println("Enter your score: ");
            scores[index] = input.nextInt();
        }
        System.out.println(Arrays.toString(scores));
        int sumOfScores = 0;
        for (int score : scores) {

            sumOfScores = sumOfScores + score;
        }
        System.out.printf("The sum of the elements in the array is: %d%n", sumOfScores);
        int [] array = new int [5];
        System.out.printf("%s%8s%n", "index", "value");
        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
        int [] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("%s%8s%n", "Header1", "Header2");
        for (int count = 0; count < arrays.length; count ++){
            System.out.printf("%5d%8d%n", count, arrays[count]);
        }
        final int ARRAY_LENGTH = 5;
        int [] square = new int [ARRAY_LENGTH];
        System.out.printf("%s%8s%n", "Header", "header");
        for (int i = 0; i < ARRAY_LENGTH; i ++){
            square[i] = 2 + 2 * i;
            System.out.printf("%5d%8d%n", i, square[i]);
        }
    }
}
