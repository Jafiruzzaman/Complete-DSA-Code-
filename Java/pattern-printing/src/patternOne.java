import java.util.Scanner;

public class patternOne {
    public static void main(String[] args) {
        System.out.println("print rectangular pattern");
        Scanner sc = new Scanner(System.in);
//      row
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
//      col
        System.out.println("Enter the number of col");
        int col = sc.nextInt();
//      print pattern
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
