import java.util.Arrays;
public class insert{
    public static void main(String[] args) {
        int []arr={22,331,21,1,2,3,45,32,9};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}