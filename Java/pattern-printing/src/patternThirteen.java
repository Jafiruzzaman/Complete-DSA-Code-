import java.util.Scanner;

public class patternThirteen {
    public static void main(String[] args) {
        System.out.println("print space with rectangular");
        Scanner sc = new Scanner(System.in);
//      row
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
//      col
        System.out.println("Enter the number of col");
        int col = sc.nextInt();
//      print pattern
        for (int i = 1; i <= row; i++) {
//          space
            for (int j = row-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
