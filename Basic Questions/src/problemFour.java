import java.util.Scanner;
// https://leetcode.com/problems/power-of-two/description/
public class problemFour {
    static boolean powerOfTwo(int x){
        if(x>0 && (x&(x-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("power of 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        boolean result = powerOfTwo(x);
        System.out.println("the result is "+result);
    }
}
