package classPackage;

public class EnhanceForLoop {
    public static void main(String...args) {
        int[] numbers = {1, 3, 5, 7};
        int sum = 0;
        //below shows enhanced-for loop...
        for (int number : numbers) {
            System.out.println(number);
            sum = sum + number;
            if (number % 2 == 0) System.out.println("unknownPackage.Number is even");
            else System.out.println("unknownPackage.Number is odd");
        }
        System.out.printf("sum of numbers is: %d%n", sum );
    }
}
