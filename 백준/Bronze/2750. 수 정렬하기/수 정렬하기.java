import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int []Line=new int[N];
        for(int i=0; i<N; i++){
            String in=br.readLine();
            Line[i]=Integer.parseInt(in);
        }
        Arrays.sort(Line);
        for(int i=0; i<N; i++){
            System.out.println(Line[i]);
        }
    }
}