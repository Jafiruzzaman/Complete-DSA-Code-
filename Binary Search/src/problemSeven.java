public class problemSeven {
    static int rotatedArray(int[] arr){
        int start =0;
        int n = arr.length;
        int end = n-1;
        if (arr[start]<=arr[end]) {
            return 0;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            int prev = (mid+n-1)%n;
            int next = (mid+1)%n;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                return mid;
            }else if(arr[mid]>=arr[start]){
                start = mid+1;
        }else{
            end=mid-1;
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int rotationCount = rotatedArray(arr);
        System.out.println("The array is rotated " + rotationCount + " times.");
    }
    
}
