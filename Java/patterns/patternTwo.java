package Java.patterns;

import java.util.Scanner;

public class patternTwo {
  public static void main(String[] args) {
    System.out.println("print Hollow Square Pattern");
    Scanner sc = new Scanner(System.in);
    // row
    System.out.println("Enter the number of row");
    int row = sc.nextInt();
    // col
    System.out.println("Enter the number of col");
    int col = sc.nextInt();
    // print hollow pattern
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (i==0 || j==0 || i==row-1 || j==col-1) {
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
