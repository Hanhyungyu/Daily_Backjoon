import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String [] time=br.readLine().split(" ");
        int H=Integer.parseInt(time[0]);
        int M=Integer.parseInt(time[1]);
       
        int cinM=Integer.parseInt(br.readLine());
        int plus=cinM+M;
        H=H+plus/60;
        M=plus%60;

      //  if((plus)<60){
        //    System.out.println(H+" "+plus);
        //}else{
          //  H=H+(plus/60);
            //M=plus%60;
        //}
        
        if(H>23){
            H=H-24;
            
        }
        
        System.out.println(H+" "+M);
        
        // 23+3=26 22+5=27 
        //H>23일때는 H-24
    }
}

