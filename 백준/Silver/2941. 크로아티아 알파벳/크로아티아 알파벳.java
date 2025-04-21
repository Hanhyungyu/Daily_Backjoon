import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        String []croatia= {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(int i=0; i<croatia.length;i++){
            input=input.replace(croatia[i],"x");
        }
        System.out.println(input.length());
    }
}