import java.util.Scanner;

public class problemSix {
  public static void main(String[] args) {
    System.out.println("Find a raise to the power b");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of a");
    int a = sc.nextInt();
    System.out.println("Enter the number of b");
    int b = sc.nextInt();
    int result= 1;
    for (int i = 1; i <= b; i++) {
      result = result*a;
    }
    System.out.println("The result is "+result);
    sc.close();
  }
}
