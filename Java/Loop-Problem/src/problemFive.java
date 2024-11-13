import java.util.Scanner;

public class problemFive {
  public static void main(String[] args) {
    System.out.println("Factorial of a number ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the factorial number");
    int num = sc.nextInt();
    int result=1;
    while (num>0) {
      result*=num;
      num--;
    }
    System.out.println("The factorial is "+result);
    sc.close();
  }
}
