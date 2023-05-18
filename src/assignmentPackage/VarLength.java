package assignmentPackage;

import java.util.Scanner;
public class VarLength {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values: ");
        int val1 = input.nextInt();
        int val2 = input.nextInt();
        int [] numbers = { 1, 2, 3, 4, 5, 6, 7};
        addIntegers(numbers);
        double [] figures = {2, 3, 4, 5,};
        multiplyIntegers(figures);
    }
    public static int addIntegers (int...numbers){
        int total = 0;
        for (int num : numbers){
            total += num;
        }
        System.out.println(total);
        return total;
    }
    public static double multiplyIntegers(double...figures){
        double total = 1;
        for (double figure : figures){
            total *= figure;
        }
        System.out.println(total);
        return total;
    }
}
