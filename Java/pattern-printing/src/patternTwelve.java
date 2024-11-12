import java.util.Scanner;

public class patternTwelve {
    public static void main(String[] args) {
        System.out.println("print character triangle");
        Scanner sc = new Scanner(System.in);
//      row
        System.out.println("Enter number of row");
        int row = sc.nextInt();
//      col
        System.out.println("Enter number of col");
        int col = sc.nextInt();
        char a = 'a';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
