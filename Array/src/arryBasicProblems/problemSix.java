package arryBasicProblems;

import java.util.Scanner;
// * link : https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
public class problemSix {
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sortedArray(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {  // Corrected condition here
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }
    static int kthSmallestElement(int[] arr,int k){
        sortedArray(arr);
        int kthElement=0;
            if (k>0 && k <= arr.length){
                kthElement = arr[k-1];
            }

        return kthElement;
    }
    public static void main(String[] args) {
        System.out.println("Find Kth Smallest Element");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {  // Corrected the loop condition to 'size' instead of 'size - 1'
            arr[i] = sc.nextInt();
        }

        sortedArray(arr);
        System.out.println("After sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("Enter kth Element ");
        int k = sc.nextInt();
        int result = kthSmallestElement(arr,k);
        System.out.println("The kth smallest element is "+result);
    }
}
