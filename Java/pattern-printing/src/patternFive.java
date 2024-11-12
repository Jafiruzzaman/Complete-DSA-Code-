import java.util.Scanner;

public class patternFive {
    public static void main(String[] args) {
        System.out.println("print count rectangular pattern");
        Scanner sc = new Scanner(System.in);
//      row
            System.out.println("Enter the number of row");
            int row = sc.nextInt();
//      col
            System.out.println("Enter the number of col");
            int col = sc.nextInt();
//      print pattern
        int count = 1;
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= col; j++) {
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }
        }
    }

