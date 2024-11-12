import java.util.Scanner;

public class patternEight {
    public static void main(String[] args) {
        System.out.println("print count number triangle ");
        Scanner sc = new Scanner(System.in);
//      row
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
