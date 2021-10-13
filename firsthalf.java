import java.util.Scanner;
import java.lang.String;
public class main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        String[] words=s.split("//s");
        System.out.println(words[0]);
    }
}