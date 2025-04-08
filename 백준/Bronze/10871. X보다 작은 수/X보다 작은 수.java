import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []test=br.readLine().split(" ");
        int N=Integer.parseInt(test[0]);
        int X=Integer.parseInt(test[1]);
        
        String []numbers=br.readLine().split(" ");
        for(int i=0; i<N;i++){
            int num=Integer.parseInt(numbers[i]);
            if(num<X){
                System.out.print(num+" ");
            }
        }
     
        
    }
}