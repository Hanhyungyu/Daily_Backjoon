import java.util.Stack;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Stack <Integer>stack= new Stack<>();
        for(int i=0;i<N; i++){
            String [] Line=br.readLine().split(" ");
            int first=Integer.parseInt(Line[0]);
         if(first==1){
             int second=Integer.parseInt(Line[1]);
             stack.push(second);
         }  else if(first==2){
             if(stack.isEmpty()){
                 System.out.println("-1");
             }else {
                 System.out.println(stack.pop());
             }
             
         }else if(first==3){
             System.out.println(stack.size());
         } else if(first==4){
             if(stack.isEmpty()){
                 System.out.println("1");
             }else {
                 System.out.println("0");
             }
         }else if(first==5){
          if(stack.isEmpty()){
              System.out.println("-1");
          }else{
              System.out.println(stack.peek());
          }   
         }
        }
        
    }
}