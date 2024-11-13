import java.util.Scanner;

public class problemThree {
  public static void main(String[] args) {
    System.out.println("reverse a number ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int result =0;
    System.out.println("The original number is "+num);
    while(num>0){
      int remainder = num%10;
      result = result*10+remainder;
      num/=10;
    }
    System.out.println("The reverse number is "+result);
    sc.close();
  }
}
