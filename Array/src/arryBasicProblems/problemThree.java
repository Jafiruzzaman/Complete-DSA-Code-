package arryBasicProblems;

// *Link https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

import java.util.Scanner;

public class problemThree {
    static int searchElement(int[] arr,int x){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Search element in an array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target elemt");
        int x = sc.nextInt();
        int result  =  searchElement(arr,x);
        System.out.print("The array elements are : ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Find "+x+" at "+result+" th index");

    }
}
