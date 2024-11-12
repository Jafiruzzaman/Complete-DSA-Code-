import java.util.Scanner;

public class patternSeven {
    public static void main(String[] args) {
        System.out.println("print number triangle ");
        System.out.println("print triangle pattern");
        Scanner sc = new Scanner(System.in);
//      row
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
