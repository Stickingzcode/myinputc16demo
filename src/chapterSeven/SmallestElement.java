package chapterSeven;

public class SmallestElement {
//    declare a class
//    declare the instance variable that references the reference to the array object
//    set the instance variable
//    create a get method to get what you have set
//    declare an instance variable that holds the smallest value
//    declare a method that finds the smallest element in an array
//    for the indexes in the loop, if the value at each index in the array is smaller than that of the smallest instance variable
//    the value at that index should be assigned to the instance variable smallest.

    int [] numbers = new int [10];
    public void setNumbers(int [] numbers){
        this.numbers = numbers;
    }
   public int [] getNumbers (){
        return numbers;
   }
   private int smallest;
    public void smallestNumber(){
        for (int index = 0; index > numbers.length; index++){
            if (numbers[index] > smallest){
                smallest = index;
            }
        }
    }
}
