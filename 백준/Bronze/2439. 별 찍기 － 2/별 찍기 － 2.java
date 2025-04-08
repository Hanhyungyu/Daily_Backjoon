import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){
//공백의 개수는 N-i개 별의 개수는 i개
            String line="";
            for(int z=1;z<=(N-i);z++){
                line=line+" ";
            }
            for(int x=0; x<i;x++){
                line=line+"*";
            }
           bw.write(line+"\n");
        }

bw.flush();



    }
}