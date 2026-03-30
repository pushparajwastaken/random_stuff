public class Sum {
    public static void main(String[] args) {
     System.out.println(sum(13));
    }
    public static int sum(int n){
        if (n<1){
            return 0;
        }
    return n%10 +sum(n/10); 
    }
}
