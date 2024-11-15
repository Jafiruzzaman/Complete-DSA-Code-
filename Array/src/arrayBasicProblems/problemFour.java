package arrayBasicProblems;

import java.util.Scanner;

// * Link : https://www.geeksforgeeks.org/program-to-reverse-an-array/
public class problemFour {
    static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        // Swap elements from both ends until reaching the middle
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Reverse an array problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        System.out.print("The array elements are : ");
        for(int i : arr){
            System.out.print(+i+" ");
        }
        System.out.println();
        sc.close();

    }
}
