package unknownPackage;

public class Multiple {
    public static void main(String...args){
        int firstInteger = 14;
        int secondInteger = 7;
        int secondIntegerDoubled = secondInteger * secondInteger;
        int firstIntegerTripled = firstInteger * firstInteger *firstInteger;
        if ( firstIntegerTripled % secondIntegerDoubled == 0)
            System.out.printf("your first value %d is a multiple of your second value %d%n", firstInteger, secondInteger);
            else
                System.out.printf("your first value %d, is not a multiple of your second value %d%n.", firstInteger, secondInteger);


    }
}
