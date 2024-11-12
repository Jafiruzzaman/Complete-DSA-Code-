import java.util.Scanner;

public class patternNine {
    public static void main(String[] args) {
        System.out.println("print reverse triangle pattern");
        Scanner sc = new Scanner(System.in);
//      row
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = i; j>0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
