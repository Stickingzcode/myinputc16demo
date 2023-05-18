package classPackage;

import classPackage.MainPassByV;

public class PassByV {

    public static void main(String[] args) {
        MainPassByV nameMain = new MainPassByV();
        nameMain.setName("Vickie");
        System.out.println("before I call the changeMainPassByVName method:: "+nameMain);
        changeMainPassByVName(nameMain);
        System.out.println("after I call the changeMainPassByName method:: "+nameMain);
        int number = 5;
        square(number);
        System.out.println("in main:: " + number);
    }
    private static void square(int number){
        number = number * number;
        System.out.println("in method:: " + number);
    }
    private static void changeMainPassByVName(MainPassByV name){
        name.setName("Alaye");
    }
}
