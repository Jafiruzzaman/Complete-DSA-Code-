import java.util.Scanner;

public class problemEight {
  static private int BinarySearch(int[] arr, int start, int end,int target){
    while(start<=end){
        int mid = start + (end-start)/2;
        if (arr[mid]==target) {
          return mid;
        }else if(arr[mid]>=target){
          end=mid-1;
        }else{
          start=mid+1;
        }
    }
    return -1;
  }
  static private int findMinElement(int[] arr){
    int start = 0;
    int n = arr.length;
    int end = n-1;
    while(start<=end){
      int mid = start+(end-start)/2;
      int next = (mid+1)%n;
      int prev = (mid+n-1)%n;
      int index=0;
      if (arr[mid]<=arr[prev] && arr[mid]<=arr[next]) {
        index=mid;
        return index;
      }else if(arr[start]<=arr[mid]){
        start=mid+1;
      }else{
        end=mid-1;
      }
    }
    return -1;
  }
  static int findElement(int[] arr,int target){
    int rotationIndex =findMinElement(arr);
    int start =0;
    int end = arr.length-1;
    int PrevIndex = rotationIndex;
    if (target>=arr[rotationIndex] && target <= arr[end]) {
      
      return BinarySearch(arr, PrevIndex, end, target);
    } else {
      return BinarySearch(arr, start, PrevIndex-1, target);
      
    }
  }
  public static void main(String[] args) {
    System.out.println("Find an element in a sorted rotated array ");
    int[] arr = {15, 18, 2, 3, 6, 12};
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the search element");
    int searchElement= sc.nextInt();
    int result = findElement(arr,searchElement);
    System.out.println("The search element in "+result+" th index in this sorted rotated array");
    sc.close();
  }
}
