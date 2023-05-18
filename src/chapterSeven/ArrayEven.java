package chapterSeven;

public class ArrayEven {
//    create a class
//    declare an array of type int and declare the size of the array
//    write a for loop: for each element in the array(multiply the index of the element by 2 and add 2 to the result)
//    for the tabular form: print a header using format %s%8s%n to carry both headers and then go to the next line.
//
    public static void main(String...args){
        int [] evenArray = new int [15];
        System.out.printf("%s%10s%n ", "ArrayIndex ", " Array Value");
        for(int arrayIndex = 0; arrayIndex < evenArray.length; arrayIndex++){
           evenArray[arrayIndex] = 2 + 2 * arrayIndex;
        }
        for(int arrayIndex = 0; arrayIndex < evenArray.length; arrayIndex++){
        System.out.printf("%5d%10d%n", arrayIndex , evenArray[arrayIndex]);
        }
    }
}
