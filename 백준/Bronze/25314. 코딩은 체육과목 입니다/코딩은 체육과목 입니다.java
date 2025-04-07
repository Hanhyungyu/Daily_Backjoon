
//첫 번째 줄에는 문제의 정수 N이 주어진다.N은 4의 배수 4부터 1000까지
//혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형
//int 앞에 long을 붙일때마다 4바이트씩 저장하는 공간이 는다.
//int는 고정이고 long한개마다 4바이트 4의 배수개수만큼 바이트
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String []args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String longnum="";
        for(int i=0; i<(N/4); i++){
            longnum=longnum+"long"+" ";
        }

//N=4일때 0일때 한번 띄워서 long long int가 된다

        System.out.println(longnum+"int");
        //N=4일때 longnum에는 long int
        //N=8인 경우 0,1 long
    }
}
