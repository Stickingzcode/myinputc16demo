package chapterSeven;

import java.util.Arrays;

public class MultiDimension {


    public static void main(String...args){
        int [] [] biggerArray = new int [4] [];
        biggerArray [0] = new int [3];
        biggerArray [1] = new int [] {1, 2, 3, 4, 5};
        biggerArray [2] = new int [] {24, 26, 28, 30};
        biggerArray [3] = new int [6];

        int multiple = 2;

        for (int index = 0; index < biggerArray[0].length; index++) biggerArray[0][index] = index;
    System.out.println(Arrays.deepToString(biggerArray));

        for (int index = 0; index < biggerArray[3].length; index++) {
            if (index == 0) biggerArray[3][index] = 100;
            if (index > 0) {
                biggerArray[3][index] = 100 * multiple;
                multiple++;
            }
        }
    System.out.println(Arrays.deepToString(biggerArray));



    }
}