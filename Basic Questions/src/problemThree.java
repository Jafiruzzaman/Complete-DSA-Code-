import java.util.Scanner;
// https://leetcode.com/problems/reverse-integer/
public  class problemThree {
    static  int reverseInt(int x){
        int ans = 0;
        int remainder = 0;
        while (x != 0) {
            remainder = x % 10;

            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;
            }

            ans = ans * 10 + remainder;
            x /= 10;
        }

        System.out.println("the answer is "+ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int result=reverseInt(x);
        System.out.println("The result is "+result);
    }
}
