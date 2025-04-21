import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []input=br.readLine().split(" ");
        int N=Integer.parseInt(input[0]);
        int k=Integer.parseInt(input[1]);
        Integer []Line=new Integer[N];
         String []input2=br.readLine().split(" ");
        for(int i=0; i<N; i++){
            Line[i]=Integer.parseInt(input2[i]);
        }
        Arrays.sort(Line, Collections.reverseOrder());
        System.out.println(Line[k-1]);
       
        
        
        
        
    }
}