import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N=Integer.parseInt(br.readLine());
        LinkedList <Integer> queue=new LinkedList<>();
        for(int i=0; i<N; i++){
            String []Line=br.readLine().split(" ");
            String first=Line[0];
            if(first.equals("push")){
                int second=Integer.parseInt(Line[1]);
                queue.offer(second);
            } else if(first.equals("pop")){
                if(queue.isEmpty()){
                   bw.write("-1\n");
                }else{
                    bw.write(String.valueOf(queue.poll()) + "\n");
                }
            }else if(first.equals("size")){
                bw.write(String.valueOf(queue.size()) + "\n");
            }else if(first.equals("empty")){
                if(queue.isEmpty()){
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
            }else if(first.equals("front")){
                if(queue.isEmpty()){
                   bw.write("-1\n");
                }else{
                    bw.write(String.valueOf(queue.peek()) + "\n");
                }
            }else if(first.equals("back")){
                if(queue.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(String.valueOf(queue.peekLast()) + "\n");
                }
            }
        }
        bw.flush();
    }
}
