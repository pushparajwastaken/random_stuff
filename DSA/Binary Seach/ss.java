public class ss {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println( pivot(arr) );
    }

    public static int findPivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start) /2;
            //case 1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
        //case 2
        else if(mid> start && arr[mid]<arr[mid-1]){
            return mid-1;
            }
        //case 3
        if(arr[start]>=arr[mid]){
            end=mid-1;
        }
        //case 4
        else if (arr[start]<arr[mid]){
start=mid+1;
        }
        }
        return -1;

    }
    public int bs(int []arr,int target){
int  pivot=findPivot(arr);
//if no pivot,it means array is not rotated
if(pivot==-1){
    //do normal binary search
    return binarySearch(nums, target, 0 , nums.length - 1);
}
 if (nums[pivot] == target) {
            return pivot;
        }
         if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
}
static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
 public static int findPivotwithDup(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start) /2;
            //case 1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
        //case 2
        else if(mid> start && arr[mid]<arr[mid-1]){
            return mid-1;
            }
       //if elements at middle,start,end are equal skip them
       if(arr[mid]==arr[start]&&arr[start]==arr[end]){

        //check if start is pivot
        if(arr[start]>arr[start+1]){
            return start;
        }
        start++;
        if(arr[end]<arr[end-1]){
            return end;
        }
        end--;
       }
//left side is sorted
 else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }
}