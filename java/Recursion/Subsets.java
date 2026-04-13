import java.util.ArrayList;

public class Subsets{
    public static void main(String[] args) {

        subseq("", "abc");
System.out.println(subseqRet("","abc"));

    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
        System.out.println(p);
        return ;
        }
        char ch=up.charAt(0);//get the first character of the substring
subseq(p+ch, up.substring(1));//add the first char of the substring and lessen the unprocessed substring
  subseq(p,up.substring(1));//without adding the first char of the unprocessed substring go to the new char
    
    }
    static ArrayList<String> subseqRet(String p,String up){
        if(up.isEmpty()){
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
        }
        char ch=up.charAt(0);//get the first character of the substring
        ArrayList<String>left=subseqRet(p+ch, up.substring(1));//add the first char of the substring and lessen the unprocessed substring
        ArrayList<String>right=subseqRet(p,up.substring(1));//without adding the first char of the unprocessed substring go to the new char
    left.addAll(right);
    return left;
    }
}