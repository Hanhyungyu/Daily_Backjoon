import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String [] first=br.readLine().split(" ");
        int N=Integer.parseInt(first[0]);
        int M=Integer.parseInt(first[1]);
         int []Z=new int[N];
        for(int i=0;i<M; i++){
             String []line=br.readLine().split(" ");
              int A=Integer.parseInt(line[0]);
              int B=Integer.parseInt(line[1]);
              int C=Integer.parseInt(line[2]);
              for(int a=A; a<=B; a++){
            Z[a-1]=C;
        }
            
        }
        
        for(int b=0;b<N;b++){
            System.out.print(Z[b]+" ");
        }
       
        
    }
}