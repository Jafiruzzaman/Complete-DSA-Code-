import java.util.Scanner;

public class patternFive {
    static int squareRoot(int x){
        int ans= 0;
        if(x<2){
            return 1;
        }
        for (int i = 1; i <=x ; i++) {
            if (i*i==x){
                ans = i;
                return ans;
            } else if (i*i>x) {
                ans= i-1;
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = sc.nextInt();
        int result = squareRoot(x);
        System.out.println("The result is "+result);
        sc.close();

    }
}
