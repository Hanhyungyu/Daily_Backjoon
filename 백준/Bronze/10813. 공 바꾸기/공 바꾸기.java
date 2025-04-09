import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []first=br.readLine().split(" ");
        int N=Integer.parseInt(first[0]);
        int M=Integer.parseInt(first[1]);
        //배열의 크기는 N 교환의 개수는 M 배열에 []안의 값과 실제 들어있는 값은 같다는 전제
        int [] line=new int[N];
        
        for(int z=1;z<=N;z++){
         line[z-1]=z;   
        }
        //N까지 해당 번째에 N이 들어있는 배열 생성
        int ch=0;
        
        for(int i=0; i<M;i++){
        String []second=br.readLine().split(" ");
        int I=Integer.parseInt(second[0]);
        int J=Integer.parseInt(second[1]);
        ch=line[I-1];
        line[I-1]=line[J-1];
        line[J-1]=ch;
        }
        
        for(int x=0; x<N; x++){
            System.out.print(line[x]+" ");
        }
        //int a=3; ->int I
        //int b=4; ->int J
        //int c=0; -> int ch
        //c=a;(c에 3삽입) c-3 a-3 b-4
        //a=b;(a-4) a-4 c-3 b-4
        //b=c; (b-3) a-4 b-3 c-3
    }
}