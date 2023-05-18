package classPackage;

import java.util.Arrays;

public class PassByValue {
    static int [] array  = {1, 2, 3, 4, 5,};
    public static void main(String[] args) {
        int number = 10;
        modifyint(number);
        System.out.println(number);

        // calling the method that squares (squarearray)
       squarearray(array);
       System.out.println(Arrays.toString(array));
    }
    //pass by value
    public static void modifyint(int num){
        num = 40;
        System.out.printf("from the modify method: ", + num);
    }
    // a method that modifies(squares) an array
    //pass by reference
    public static void squarearray(int[] array){
        for (int i = 0; i < array.length; i ++){
            array[i] = array[i] * array[i];
        }
        System.out.print(Arrays.toString(array));
    }
}
