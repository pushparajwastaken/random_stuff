import java.util.*;

public class ceiling {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,12,23,45};
        System.out.println(search(arr,15));
    }
    static int search(int[]arr,int target){
        if(arr[arr.length-1]<target)return -1;
        int ceil =Integer.MAX_VALUE;
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start) /2;
            if(arr[mid]>target){
               end=mid-1;
            }
            else if(arr[mid]<target){
start=mid+1;
            }else{
            return arr[mid];
            }
           
        }
        return start;
    }
}
