import java.util.*;
public class SubsetsIt {
    public static void main(String[] args) {
        int[]arr={1,2,4};
    List<List<Integer>> ans=subset(arr);
    for(List<Integer> list:ans){
        System.out.println(list);
    }
    int[]arr1={1,2,3,4,2,1,2,42,4,3};
    Arrays.sort(arr1);

      List<List<Integer>> ans1=subsetWithDup(arr1);
    for(List<Integer> list:ans1){
        System.out.println(list);
    }
    }
    static List<List<Integer>> subset(int[]arr){
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int size=outer.size();
            for(int i=0;i<size;i++){
                List<Integer> internal =new ArrayList<>(outer.get(i));//this creates a copy of the outer list 
                internal.add(num);
                outer.add(internal);
            }
            
        }
        return outer;
    }
        static List<List<Integer>> subsetWithDup(int[]arr){
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
if(arr[i]==arr[i-1]) continue;
            }
            int size=outer.size();
            for(int j=0;j<size;j++){
                List<Integer> internal =new ArrayList<>(outer.get(j));//this creates a copy of the outer list 
                internal.add(arr[i]);
                outer.add(internal);
            }
            
        }
        return outer;
    }
}
