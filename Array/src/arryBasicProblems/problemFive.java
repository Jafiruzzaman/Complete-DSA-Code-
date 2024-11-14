package arryBasicProblems;

import java.util.Scanner;

// * Link : https://www.geeksforgeeks.org/problems/second-largest3735/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class problemFive {
    static int FindMax(int[] arr){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    static int FindSecondMax(int[] arr){
        int ans = FindMax(arr);
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (ans!=arr[i] && arr[i]>secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        System.out.println("Find the Second Max Element ");
        System.out.println("Enter the Size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = FindSecondMax(arr);
        System.out.print("The array elements are : ");
        for(int i : arr){
            System.out.print(+i+" ");
        }
        System.out.println();
        System.out.println("The Second Largest element is "+result);
    }
}
