import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //킹 1개 퀸 1개 룩 2개 비숍 2개 나이트 2개 폰 8개
        int [] chess={1,1,2,2,2,8};
        String [] s=br.readLine().split(" "); //1 0 0 0 0 1
        //그니까 입력 +출력해서
        // 1,1,2,2,2,8배열이 나와야 하니까
        //a+b=c; a는 입력 b는 출력 c는 chess배열 b=c-a;
        
        for(int i=0; i<6; i++){
        int n=Integer.parseInt(s[i]);
            n=chess[i]-n;
            System.out.print(n+" ");
        }
        
        
    }
}