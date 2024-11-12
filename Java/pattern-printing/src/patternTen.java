import java.util.Scanner;

public class patternTen {
    public static void main(String[] args) {
        System.out.println("print character rectangular pattern");
        Scanner sc = new Scanner(System.in);
//      row
        System.out.println("Enter number of row");
        int row = sc.nextInt();
//      col
        System.out.println("Enter number of col");
        int col = sc.nextInt();
        char a = 'a';
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a+" ");
            }
            a++;
            System.out.println();
        }
    }
}
