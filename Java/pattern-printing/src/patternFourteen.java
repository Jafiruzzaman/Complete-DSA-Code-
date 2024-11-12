import java.util.Scanner;

public class patternFourteen {
    public static void main(String[] args) {
        System.out.println("print reverse triangle");
        System.out.println("print space with rectangular");
        Scanner sc = new Scanner(System.in);
//      row
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
//      col
        System.out.println("Enter the number of col");
        int col = sc.nextInt();
//      print pattern
        for (int i = row; i >0; i--) {
//      * print star
            for (int k = i; k>0; k--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
