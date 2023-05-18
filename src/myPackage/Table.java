package myPackage;

public class Table {
    public static void main(String...args){
        System.out.printf("%5s%8s%10s%n", "Numbers", "Square", "Cube");
        for (int count =0; count < 11; count++ ){
            System.out.printf( "%3d%8d%12d%n", count, (count * count), (count *count *count)  );
        }
    }

}
