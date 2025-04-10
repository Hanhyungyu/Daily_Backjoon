import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        //테스트 케이스 개수 
        for(int i=0;i<T; i++){
            String []line=br.readLine().split(" ");
            int R=Integer.parseInt(line[0]);
            String S= line[1];
            String input="";
            //테스트 케이스대로 반복하는 횟수랑 반복하는 문자열 받기
            for(int z=0; z<S.length();z++){
                char c=S.charAt(z);
                    for(int x=0; x<R;x++){
                        input=input+c;
                    }
            }
            System.out.println(input);
        }
    }
}