package assignmentPackage;

public class Factorial {
    int value1 = 23;
    int value2 = 24;
    int value3 = 25;
    public static void main(String[] args) {
       Factorial factorial = new Factorial();
       Factorial.getMaxValue(23, 24, 25);
       Factorial.getMinValue(23, 24, 25);
    }
        public static int getMaxValue(int value1, int value2, int value3){
          int max = Math.max(value1, Math.max(value2,value3));
            System.out.println("The maximum value is: " + max);
          return max;
        }
        public static int getMinValue(int value1, int value2, int value3){
        int min = Math.min(value1, Math.min(value2, value3));
        System.out.println("The minimum value is: " + min);
        return min;
        }
    //}
   // public int add(int num1, int num2){
     //   return addTwoNumbers (num1, num2);
    //}
    //public int addTwoNumbers (int num1, int num2){
      //  return num1 + num2;

   // public static void main(String[] args) {

       // Scanner userInput = new Scanner(System.in);
        //System.out.println("Enter a Value: ");
        //int userValue = userInput.n

}
