import java.util.Scanner;

public class patternFour {
    public static void main(String[] args) {
        System.out.println("print number rectangular pattern");
        Scanner sc = new Scanner(System.in);
//      row
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
//      col
        System.out.println("Enter the number of col");
        int col = sc.nextInt();
//      print pattern
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
