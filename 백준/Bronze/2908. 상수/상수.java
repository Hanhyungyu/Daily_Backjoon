import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []line=br.readLine().split(" ");
       String a=line[0];
        String b=line[1];
        int A=Integer.parseInt(""+a.charAt(2)+a.charAt(1)+a.charAt(0));
        int B=Integer.parseInt(""+b.charAt(2)+b.charAt(1)+b.charAt(0));
        if(A>B){
            System.out.println(A);
        }else{
            System.out.println(B);
        }
    }
}