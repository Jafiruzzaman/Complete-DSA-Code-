import java.util.Scanner;
// * Link: https://leetcode.com/problems/palindrome-number/
public class problemSix {
    static boolean palindromeNumber(int x){
        int reverse= 0;
        int original= x;
        if (x<0){
            return false;
        }
        while (x>0){
            int remainder= x%10;
            reverse= reverse*10+remainder;
            x/=10;
        }
        if (reverse==original){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println("number palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        boolean result = palindromeNumber(x);
        System.out.println("The number is palindrome "+result);
        sc.close();
    }
}
