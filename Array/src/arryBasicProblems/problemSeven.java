package arryBasicProblems;

import java.util.Scanner;

public class problemSeven {
    static  int findMissing(int[] arr){
        int n = arr.length;
        int sum = 0;
        int misssing =0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        int ans = ((n + 1) * (n + 2)) / 2;
        misssing = ans-sum;
        return misssing;
    }
    public static void main(String[] args) {
        System.out.println("Find the missing number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findMissing(arr);
        System.out.print("The array elements are : ");
        for(int i : arr){
            System.out.print(+i+" ");
        }
        System.out.println("The missing number is "+result);
    }
}
