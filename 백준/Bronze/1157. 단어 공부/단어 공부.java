import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String word=br.readLine().toLowerCase();
        int[]count=new int[26];
        
        for(int i=0; i<word.length();i++){
            count[word.charAt(i)-'a']++;
        }// count배열에 해당하는 문자가 해당되는 경우 증감되서 숫자가 카운팅된 채로 들어가있다.
        
        int max=-1;
        char c='?';
        
        for(int i=0; i<26; i++){
            if(count[i]>max){
                max=count[i];
                c=(char)(i+'A');
            }else if(count[i]==max){
                c='?';
            }
        }
        System.out.println(c);
        
    }
}