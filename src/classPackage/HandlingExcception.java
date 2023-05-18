package classPackage;

public class HandlingExcception {
    public static void main(String...args) {
        try {
            int[] figures = {1, 2, 3, 4};
            System.out.println(figures[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    }
}
