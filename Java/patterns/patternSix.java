package Java.patterns;

import java.util.Scanner;

public class patternSix {
  public static void main(String[] args) {
    System.out.println("print number triangle pattern");
    Scanner sc =new Scanner(System.in);
    // row
    System.out.println("enter the number of row");
    int row = sc.nextInt();
    // print pattern
    System.out.println();
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
