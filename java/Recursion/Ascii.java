import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        char ch='a';
        System.out.println(ch+0);
        System.out.println((char)(ch+0));
    subseqAscii("", "abc");
    System.out.println(subseqRetAscii("", "abc"));
    }
    static void subseqAscii(String p,String up){
        if(up.isEmpty()){
        System.out.println(p);
        return ;
        }
        char ch=up.charAt(0);//get the first character of the substring
subseqAscii(p+ch, up.substring(1));//add the first char of the substring and lessen the unprocessed substring
  subseqAscii(p,up.substring(1));//without adding the first char of the unprocessed substring go to the new char
    subseqAscii(p+(ch+0),up.substring(1));
    }
     static ArrayList<String> subseqRetAscii(String p,String up){
        if(up.isEmpty()){
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
        }
        char ch=up.charAt(0);//get the first character of the substring
        ArrayList<String>first=subseqRetAscii(p+ch, up.substring(1));//add the first char of the substring and lessen the unprocessed substring
        ArrayList<String>second=subseqRetAscii(p,up.substring(1));//without adding the first char of the unprocessed substring go to the new char
   ArrayList<String>third=subseqRetAscii(p+(ch+0),up.substring(1));//without adding the first char of the unprocessed substring go to the new char
   
        first.addAll(second);
        first.addAll(third);
    return first;
    }
}
