import java.util.Scanner;
/*
     Link: https://leetcode.com/problems/add-digits/description/
 */
public class problemOne {

    public static void main(String[] args) {
        System.out.println("Add two digits");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int ans=0;
        while (num>9){
        ans =0;
           while (num!=0){
               ans+=num%10;
               num/=10;
           }
           num = ans;
        }
        System.out.println("The result is "+ans);
    }
}