package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;
public class PixelQuantization {
    public static void main(String...args){
        int [] pixel = new int [10];
        int pixelValue;
        for (int number = 0; number < pixel.length; number++ ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter pixel values: ");
            pixelValue = input.nextInt();
            if (pixelValue <= 20) pixelValue = 10;
            pixel[number] = pixelValue;
            if (21 << pixelValue <= 40) pixelValue = 30;
            pixel[number] = pixelValue;
            if (41 << pixelValue <= 60) pixelValue = 50;
            pixel[number] = pixelValue;
            if (61 << pixelValue <= 80) pixelValue = 70;
            pixel[number] = pixelValue;
            if (81 << pixelValue <= 100) pixelValue = 90;
            pixel[number] = pixelValue;
            if (101 << pixelValue <= 120) pixelValue = 110;
            pixel[number] = pixelValue;
            if (121 << pixelValue <= 140) pixelValue = 130;
            pixel[number] = pixelValue;
            if (pixelValue > 140)
                pixelValue = 190;
            pixel[number] = pixelValue;
        }
        System.out.println(Arrays.toString(pixel));
    }
}
