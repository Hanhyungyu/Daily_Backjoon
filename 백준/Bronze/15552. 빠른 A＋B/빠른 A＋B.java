import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){
            String [] test=br.readLine().split(" ");
            int A=Integer.parseInt(test[0]);
            int B=Integer.parseInt(test[1]);
            
            bw.write((A+B)+"");
            bw.newLine();
        }
         bw.flush(); 
    }
}