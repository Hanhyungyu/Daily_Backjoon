import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String [] line= br.readLine().split(" ");
        int N=Integer.parseInt(line[0]);
        int M=Integer.parseInt(line[1]);
        HashSet<String> set=new HashSet<>();
        
       
        for(int i=0; i<N; i++){
         String str=br.readLine();
            set.add(str);
        }
        ArrayList<String> result=new ArrayList<>();
        
        for(int i=0; i<M; i++){
            String str=br.readLine();
            if(set.contains(str)){
                result.add(str);
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
        
        
    }
}