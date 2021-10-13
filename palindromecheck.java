import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
class main {
    public static void main(String args[]){
        Scannerdad sc=new Scanner(System.in);
        System.out.println("enter the word");
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);
        String rev_s = sb.reverse().toString();
        if(rev_s.equals(s)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}
