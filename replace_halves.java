import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class replace_halves {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String words[] = s.split(" ");
        ArrayList<String> AL_words = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            AL_words.add(words[i]);
        }
        Collections.reverse(AL_words);
        for(int i=0;i<AL_words.size();i++){
            System.out.print(AL_words.get(i)+" ");
        }
    }
}
