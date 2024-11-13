import java.util.Scanner;

public class problemOne {
    public static void main(String[] args) {
        System.out.println("Count the number of digits for given number n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
            int count=0;
        for (int i = num; num>0 ; i--) {
            int remainder = num % 10;
            count++;
            num/=10;
        }
        System.out.println("the digit of the number is "+count);
    }
}
