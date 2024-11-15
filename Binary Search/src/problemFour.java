import java.util.Scanner;

public class problemFour {
    static int FindFirstOccurrence(int[] arr,int target ){
        int start = 0;
        int end = arr.length-1;
        int result =-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target){
                result = mid;
                end = mid-1;
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Find the first index of an element in a sorted Array ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        System.out.println("After implement binary search ");
        int result = FindFirstOccurrence(arr,target);
        System.out.println("The First Occurrence of "+target+" is "+result);
        sc.close();
    }
}
