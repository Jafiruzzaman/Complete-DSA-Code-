import java.util.Scanner;

public class problemFour {
  public static void main(String[] args) {
    System.out.println("find the sum of following series");
    // 1-2+3-4+5-6+7-8+...........+n
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the serial of the number ");
    int n = sc.nextInt();
    int ans=0;
    for (int i = 1; i <= n; i++) {
      if (i%2==0) {
        ans-=i;
      }else{
        ans+=i;
      }
    }
    System.out.println("The total sum of the series is "+ans);
    sc.close();
  }
}
