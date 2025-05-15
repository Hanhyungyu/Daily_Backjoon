import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
         int [][] graph=new int[N][2];
        for(int i=0; i<N; i++){
            String []Line=br.readLine().split(" ");
            graph[i][0]=Integer.parseInt(Line[0]);
            graph[i][1]=Integer.parseInt(Line[1]);
        }
        
       Arrays.sort(graph, new Comparator<int []>(){
            public int compare(int []a, int[] b){
                if(a[1]==b[1]){
                    return a[0]-b[0];
                }else{
                    return a[1]-b[1];
                }
            }
        });
      for (int i = 0; i < N; i++) {
    System.out.println(graph[i][0] + " " + graph[i][1]);
}

    }
}