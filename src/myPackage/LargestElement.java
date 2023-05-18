package myPackage;

public class LargestElement {
// declare a class
//  declare an instance variable that takes an array
//  the set method to set the value of the instance variable
//  the get method to get what has been set
//  declare a method that picks the largest element
//  declare an instance variable that will carry/be assigned to the largest element
//  for all indexes in the loop i.e for each element in the array, if the value at each index is greater than the largest element
//  set the largest element to equal the value at that index
int [] elements = new int [7];
public void setElements (int [] elements){
        this.elements = elements;
}
public int [] getElements(){
        return elements;
}
private int largest;
public void largestElement(){
        for (int index = 0; index < elements.length; index++){
                if (elements[index] > largest){
                   largest = index;
                }
        }
}
}

