import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        char c=input.charAt(0);
        int b=(int)c;
        System.out.println(b);
    }
}