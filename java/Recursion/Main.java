public class Main{
    public static void main(String[] args) {
        message(1);
    }
    static void message(int n){
        if(n==5)return ;
        System.out.println(n+" ");
        n++;
        //this is called tailed recursion-this is the last function call
        message(n);
    }
}