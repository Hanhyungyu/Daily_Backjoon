import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []Line=br.readLine().split(" ");
        int N=Integer.parseInt(Line[0]);
        int M=Integer.parseInt(Line[1]);
        int [][]arr=new int[N][M];
 
         // 1 1 1 M=0이고 N이 달라진다.
        // 2 2 2 M=1 이고 N이 달라진다.
        for(int i=0; i<N;i++){
            String []inLine=br.readLine().split(" ");
               for(int j=0; j<M;j++){
                   arr[i][j]=Integer.parseInt(inLine[j]);
               }
        }
        
          for(int i=0; i<N;i++){
            String []inLine=br.readLine().split(" ");
               for(int j=0; j<M;j++){
                   arr[i][j]=arr[i][j]+Integer.parseInt(inLine[j]);
               }
        }
        
        for(int i=0; i<N; i++){
           for(int j=0; j<M; j++){
               System.out.print(arr[i][j]+" ");
           }
            System.out.println();
        }
        
       
    }
}