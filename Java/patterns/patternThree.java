package Java.patterns;

import java.util.Scanner;

public class patternThree {
  public static void main(String[] args) {
    System.out.println("print right angle triangle pattern");
    Scanner sc = new Scanner(System.in);

    // row
    System.out.println("Enter of number of row");
    int row = sc.nextInt();

    //col
    System.out.println("Enter of number of col");
    int col = sc.nextInt();

    // print triangle
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    sc.close();
  }
}
