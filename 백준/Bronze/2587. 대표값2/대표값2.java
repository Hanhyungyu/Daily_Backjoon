import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int []Line=new int[5];
        int sum=0;
        for(int i=0; i<5; i++){
            String input=br.readLine();
            Line[i]=Integer.parseInt(input);
            sum=sum+Line[i];
        }
        Arrays.sort(Line);
        
        
        System.out.println(sum/5);
        System.out.println(Line[2]);
    }
}