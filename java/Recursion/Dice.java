import java.util.*;
public class Dice {
    public static List<List<Integer>> res=new ArrayList<>();
    public static void main(String[] args) {
        helper(5,0);
    }
    public static void helper(int target,int[] curr){
        if(target==0){
        List<Integer> permutation = new ArrayList<>();
        for (int num : temp) {
            permutation.add(num);
        }

        base.add(permutation);
      
            return ;
        }
        for(int i=0;i<6&&i<=target;i++){
            helper(target-i,curr+i);
        }
        

    }
}
