import java.util.Scanner;
public class EvenOddReplace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String words[] = s.split(" ");
        for(int i=0;i<words.length;i=i+2){
            if(words.length%2!=0 && i==words.length-1){
                break;
            }
            String temp = words[i];
            words[i]=words[i+1];
            words[i+1]=temp;
        }
        for(String word:words){
            System.out.print(word+" ");
        }
        
    }

    
}
