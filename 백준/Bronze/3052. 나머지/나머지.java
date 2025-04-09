import java.io.*;
import java.util.HashSet;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer>line=new HashSet<>();
        for(int i=0; i<10;i++){
            int num=Integer.parseInt(br.readLine());
            line.add(num%42);
        }
        System.out.println(line.size());
    }
}