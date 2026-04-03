class InPlaceMergeSort{
    public static void main(String[] args) {
        int[] arr={45,5,6,34,21,3,67};
       merge(arr,0,arr.length);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+",");
      }
    }
    public static void merge(int []arr,int low,int high){
        if(high-low<=1){
            return;
        }
        int mid=low+(high-low) /2;
        merge(arr,low,mid);
        merge(arr,mid,high);
        mergeSort(arr,low,mid,high);
        return;
    }
    public static void mergeSort(int[]arr,int low,int mid,int high){
        int []mix=new int[high-low];
        int i=low;
        int j=mid;
        int k=0;
        while(i< mid &&j<high){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
           mix[k]=arr[i];
                i++;
                k++; 
        }
        while(j<high){
            mix[k]=arr[j];
                j++;
                k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[low+l]=mix[l];
        }
    }
}