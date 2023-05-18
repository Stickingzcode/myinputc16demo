package assignmentPackage;

public class FizzBuzz {
    public static void main(String[] args) {

        int Hundred = 0;
        int Odd = Hundred & 3;
        int OddI = Hundred & 5;

        while ( Hundred <= 100) {

            if ( Odd == 0 && OddI== 0) {
                System.out.println ("assignmentPackage.FizzBuzz");}

         else if ( Odd == 0) {
             System.out.println ("Fizz");}

         else if ( OddI == 0) {
                 System.out.println ("Buzz");
              }
         System.out.println(Hundred);
         Hundred++;
     }
     }

     }

