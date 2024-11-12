package Java.patterns;

import java.util.Scanner;

public class patternOne {
  public static void main(String[] args) {
    System.out.println("print squares");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row = scanner.nextInt();
    System.out.println("Enter the number of col");
    int col= scanner.nextInt();
    // print square
    for (int i = 0; i <row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
