import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int N=Integer.parseInt(br.readLine());
        int count=0;
        
        for(int i=0; i<N; i++){
            String word=br.readLine();
            boolean[]seen=new boolean[26];
            boolean isgroup=true;
            char prev=0;
            for(int j=0; j<word.length();j++){
                char now=word.charAt(j);
                if(now !=prev){
                    if(seen[now-'a']){
                        isgroup=false;
                        break;
                    }
                    seen[now-'a']=true;
                }
                prev=now;
            }
            if(isgroup){
                count++;
            }
        }
        System.out.println(count);
    }
}