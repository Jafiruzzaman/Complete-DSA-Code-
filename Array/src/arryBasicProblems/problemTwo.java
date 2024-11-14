package arryBasicProblems;

import java.util.Scanner;

public class problemTwo {
    static int FindMaximumElement(int[] x){
        int length = x.length;
        int minimum=Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (x[i]>minimum){
                minimum= x[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        System.out.println("Find the maximum element in an array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result  =  FindMaximumElement(arr);
        System.out.print("The array elements are : ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("The maximum element is "+result);
    }
}
