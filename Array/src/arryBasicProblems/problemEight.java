package arryBasicProblems;

import java.util.Scanner;

public class problemEight {
    static int[] rotatedArray(int[] arr,int rotate){
        int size = arr.length;  // Get the size of the array
        rotate = rotate % size; // Handle cases where rotate is larger than array size
        int[] brr = new int[size]; // New array to store the rotated elements
        int k = 0;

        for (int i = size - rotate; i < size; i++) {
            brr[k++] = arr[i];
        }

        // Copy the first 'size - rotate' elements from the original array to brr
        for (int i = 0; i < size - rotate; i++) {
            brr[k++] = arr[i];
        }

        return brr;
    }
    public static void main(String[] args) {
        System.out.println("rotate an array ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("How many times to rotate ");
        int rotate = sc.nextInt();
//      rotate the array
        int[] brr= rotatedArray(arr,rotate);
        System.out.println("After rotated the array");
            System.out.print("The elements are : ");
        for(int i : brr){
            System.out.print(i+" ");
        }
    }
}