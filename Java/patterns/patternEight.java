package Java.patterns;

import java.util.Scanner;

public class patternEight {
  public static void main(String[] args) {
    System.out.println("print alphabetic rectangular pattern");
    Scanner sc = new Scanner(System.in);
    // row
    System.out.println("Enter the number of row");
    int row = sc.nextInt();
    // col
    System.out.println("Enter the number of col");
    char a = 'a';
    int col = sc.nextInt();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(a+" ");
        a++;
      }
      System.out.println();
    }


    sc.close();
  }
}
