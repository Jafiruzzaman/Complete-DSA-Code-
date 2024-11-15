import java.util.Scanner;

public class problemThree {
    static int OrderAgnosticBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAscending = false;
        if (arr[start]<arr[end]){
            isAscending = true;
        }
        while (start<=end){
            int mid = start + (end-start)/2;
            if (isAscending){
                if (arr[mid]==target){
                    return mid;
                } else if (arr[mid]>target) {
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if (arr[mid]==target){
                    return mid;
                } else if (arr[mid]>target) {
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Order Agnostic Binary Search ");
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
        int result = OrderAgnosticBinarySearch(arr,target);
        System.out.println("Implementing order agnostic binary search "+result);
    }
}
