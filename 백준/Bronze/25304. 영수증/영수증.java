import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int X=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        int plus=0;
        
        for(int i=0; i<N; i++){
            String []things=br.readLine().split(" ");
            int a=Integer.parseInt(things[0]);
            int b=Integer.parseInt(things[1]);
            plus=plus+a*b;
        }
        if(plus==X){
            System.out.println("Yes");
            
        }else{
            System.out.println("No");
        }
    
        
      
       
    }
    }