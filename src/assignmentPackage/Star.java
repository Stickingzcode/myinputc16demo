package assignmentPackage;

public class Star {
    public static void main(String[] args) {
        int StarI = 0;
        while (StarI < 5) {
            int AsteriskJ = 0;
          while (AsteriskJ <= StarI) {
            System.out.print ("x");
              AsteriskJ++;
          }
            System.out.println();
            StarI++;
        }

    for (; StarI < 5; StarI++) {
        for (int AsteriskJ = 0; AsteriskJ <= StarI; AsteriskJ++) {
            System.out.print("x");
            }
        System.out.println();
        }
    }
}
