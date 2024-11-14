package basics;
import java.util.Scanner;

public class basicArray {
    public static void main(String[] args) {
        System.out.println("create an array");
//       * number 01
        int[] arr = {1,2,3,4,5};
//       * number 02
        int[] brr =new int[5];
//       * number 03
        int[] crr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values : ");
        for (int i = 0; i < crr.length; i++) {
            crr[i] = sc.nextInt();
        }
//      print array using for-each loop
        for (int i : crr){
            System.out.println("The values are "+i);
        }
//      * number 04
        int drr[] = new int[5];
        drr[0] = 5;
        drr[1] = 2;
        drr[2] = 3;
        for (int i : drr){
            System.out.print(i+" ");
        }
    }
}
