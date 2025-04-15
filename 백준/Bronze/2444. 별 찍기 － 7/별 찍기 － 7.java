import java.io.*;
public class Main {
    public static void main(String []args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int i=0; i<N;i++){
            //i는 0-1-2-3-4 고 별의 개수는 1,3,5,7,9 공백의 개수는 4 3 2 1 0
            //                          0 1 2 3 4
            //i가 0일때 별 개수의 z<1; 이 찍혀야 하고 공백의 개수는 c<4;가 찍히고
            //i가 1일 때 별 개수는 z<3; 이 찍히고 공백의 개수는 c<3
            String s="*";
            String blank=" ";
            for(int c=0; c<N-i-1; c++){
                System.out.print(blank);
            }
            for(int z=0; z<i*2+1;z++){
           System.out.print(s);
            }

System.out.println();
        }

        for(int i=N-1; i>0;i--){
     //         i는 4 3 2 1 순으로 별의 값은 7 5 3 1 blank는 1 2 3 4
            String s="*";
            String blank=" ";

            for(int c=0; c<N-i; c++){
                System.out.print(blank);
            }
            for(int z=0; z<i*2-1;z++){
                System.out.print(s);
            }

            System.out.println();
        }
    }
}
