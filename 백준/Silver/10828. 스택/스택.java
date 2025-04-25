import java.io.*;
import java.util.Stack;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer>stack=new Stack<>();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N; i++){
            String []S=br.readLine().split(" ");
            String St=S[0];
            
            
            if(St.equals("push")){
                 int z=Integer.parseInt(S[1]);
                stack.push(z);
         
            }else if(St.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                     System.out.println(stack.pop());
                }
               
            }else if(St.equals("size")){
                System.out.println(stack.size());
            }else if(St.equals("empty")){
               if(stack.isEmpty()){
                   System.out.println("1");
               }else{
                   System.out.println("0");
               }
            }else if(St.equals("top")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                     System.out.println(stack.peek());
                }
          
            }
            
        }
        
        
    }
}