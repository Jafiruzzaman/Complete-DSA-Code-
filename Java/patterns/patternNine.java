package Java.patterns;

import java.util.Scanner;

public class patternNine {
  public static void main(String[] args) {
    System.out.println("print character triangle");
    Scanner sc = new Scanner(System.in);
    // row
    System.out.println("Enter the number of row");
    int row = sc.nextInt();

    char a = 'a';
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(a+" ");
        a++;
      }
      System.out.println();
    }
    sc.close();
  }
}
