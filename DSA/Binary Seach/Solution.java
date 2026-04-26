import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
       int[] nums ={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        
        int[] ans=new int[2];
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
    }
    static int search(int[]arr,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start) /2;
            if(arr[mid]>target){
                end=mid-1;
            }
           else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                //potential answer found
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
} 
