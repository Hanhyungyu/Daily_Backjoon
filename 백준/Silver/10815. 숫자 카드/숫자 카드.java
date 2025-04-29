import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set=new HashSet<>();
        int N=Integer.parseInt(br.readLine());
        String[] NLine=br.readLine().split(" ");
        for(int i=0;i<N; i++){
           set.add(Integer.parseInt(NLine[i]));
        }
        int M=Integer.parseInt(br.readLine());
        String []MLine=br.readLine().split(" ");
        for(int i=0; i<M; i++){
            int num=Integer.parseInt(MLine[i]);
            if(set.contains(num)){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
        
    }
}