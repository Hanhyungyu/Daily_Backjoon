import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S=br.readLine();
        
        for(char a='a';a<='z';a++){
            boolean f=false;
            for(int i=0; i<S.length(); i++){
                if(a==S.charAt(i)){
                    f=true;
                    System.out.print(i+" ");
                    break;
                    
                }
              
            }
              if(!f){
                    System.out.print("-1 ");
                }
        }
    }
}