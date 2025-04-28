import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Deque<Integer>deque=new ArrayDeque<>();
        
        for(int i=0; i<N; i++){
            String []Line=br.readLine().split(" ");
            int X=Integer.parseInt(Line[0]);
            if(X==1){
                int Y= Integer.parseInt(Line[1]);
                deque.offerFirst(Y);
            }else if(X==2){
                int Y=Integer.parseInt(Line[1]);
                deque.offerLast(Y);
            }else if(X==3){
                if(deque.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(deque.removeFirst());
                }
            }else if(X==4){
                 if(deque.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(deque.removeLast());
                }
            }else if(X==5){
                System.out.println(deque.size());
            }else if(X==6){
                if(deque.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if(X==7){
                   if(deque.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(deque.peekFirst());
                }
            }else if(X==8){
                     if(deque.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(deque.peekLast());
                } 
            }
        }
    }
}