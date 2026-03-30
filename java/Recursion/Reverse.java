public class Reverse {
    public static void main(String[] args) {
        System.out.println(rever(4567,0));
    }
    public static int rever (int x,int sum){
        if(x<1){
            return sum;
        }
        int rem=x%10;
        sum=sum * 10 + rem;
        return rever(x/10,sum);
        
    }
}
