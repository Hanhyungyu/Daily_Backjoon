import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []first=br.readLine().split(" ");
        int N=Integer.parseInt(first[0]);
        int M=Integer.parseInt(first[1]);
        
       int []line=new int[N];
        for(int i=0; i<N;i++){
            line[i]=i+1;
        }
        
        for(int i=0; i<M; i++){
        String []second=br.readLine().split(" ");
        int I=Integer.parseInt(second[0])-1;
        int J=Integer.parseInt(second[1])-1;
          
            while (I<J){
                int temp=line[I];
                line[I]=line[J];
                line[J]=temp;
                I++;
                J--;
            }
        
            
        }
        
        for(int i=0; i<N; i++){
        System.out.print(line[i]+" ");    
        }
        
        
    }
}