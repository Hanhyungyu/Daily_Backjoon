import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []time=br.readLine().split(" ");
        int H=Integer.parseInt(time[0]);
        int M=Integer.parseInt(time[1]);
        
       // M이 45보다 큰 경우 M-45 그냥 출력
        //M이 45보다 작은 경우 H-1하고 M+60-45니까 M+15
        //H가 00시 -1은 23시 인데 
        //-1일때는 23시로 출력
        
        if(M>=45){
            M=M-45;
           
        }else{
            H=H-1;
            M=M+15;
        if(H<0){
            H=23;
             
        }
        }
        System.out.println(H+" "+M);
       
    }
}