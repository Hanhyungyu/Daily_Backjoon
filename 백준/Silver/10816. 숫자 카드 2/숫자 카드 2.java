import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N=Integer.parseInt(br.readLine());
        HashMap<Integer,Integer>set=new HashMap<>();
        String []NLine=br.readLine().split(" ");
        for(int i=0; i<N; i++){
            int num=Integer.parseInt(NLine[i]);
          set.put(num, set.getOrDefault(num,0)+1);
        }
        
        int M=Integer.parseInt(br.readLine());
        String []MLine=br.readLine().split(" ");
        for(int i=0; i<M; i++){
            int num=Integer.parseInt(MLine[i]);
            bw.write(set.getOrDefault(num,0)+" ");

            
        }
        bw.flush();
    }
}