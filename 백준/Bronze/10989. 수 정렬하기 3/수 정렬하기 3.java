import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int[] Line = new int[x];

        for (int i = 0; i < x; i++) {
            Line[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(Line);

        for (int i = 0; i < x; i++) {
            bw.write(String.valueOf(Line[i]));
            bw.newLine();
        }
        bw.flush();
    }
}