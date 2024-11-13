import java.util.Scanner;

public class problemTwo {
  public static void main(String[] args) {
    System.out.println("find the sum of digits in a given number n");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int result =0;
    while (num>0) {
      int remainder = num%10;
      result+=remainder;
      num/=10;
    }
    System.out.println("The result is "+result);
    sc.close();
  }
}
