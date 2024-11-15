import java.util.Scanner;

public class problemTwo {
    public static void main(String[] args) {
        System.out.println("Find the leap year");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (year%400==0){
            System.out.println("The year is a leap year");
        } else if ((year%4==0 && year%100!=0)) {
            System.out.println("The year is a leap year");
        }else
            System.out.println("The year is not a leap year");
        sc.close();
    }
}
