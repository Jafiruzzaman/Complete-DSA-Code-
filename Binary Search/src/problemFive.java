import java.util.Scanner;

public class problemFive {
    static int lastOccurrence(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target){
                result= mid;
                start=mid+1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Find the last Occurrence of an element in a sorted array ");
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
        int result = lastOccurrence(arr,target);
        System.out.println("The last index of "+target+" is "+result);
    }
}
