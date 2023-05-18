package chapterSeven;

public class ArrayChart{
//    declare a class
//    declare an array of type int snd populate it with student grades
//    for each element at index positions: write a condition such that if the element is within a particular range of numbers,
//    the number at that index position b represented by an asterisk or a number of asterisks.
    public static void main(String...args){
    int [] grades = {7, 4, 2, 7, 2, 9, 0, 9, 6, 5};

    System.out.printf("%8s  %10s%n", "Range", "Corresponding Value");

    for(int count = 0; count < grades.length; count++){
        System.out.printf("%02d-%02d: ", count * 1, ((count * 1) + 10));
        {
        for (int asterisk = 0; asterisk < grades[count]; asterisk++)
            System.out.printf("*");
        }System.out.println();
        }
    }
}
