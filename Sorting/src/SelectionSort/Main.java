package SelectionSort;

import java.util.Scanner;

public class Main {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    public static void main(String[] args) {
        System.out.println("Selection Sort");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int size = sc.nextInt();
        int[] arr= new int[size];
        System.out.print("Enter the elements : ");
        for(int i = 0; i < size; i++) {
           arr[i] = sc.nextInt();
        }
        System.out.println("After sorted");
        selectionSort(arr);
        System.out.println("The elements are : ");
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
