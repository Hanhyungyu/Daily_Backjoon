import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int []first=new int[N];
        String []line=br.readLine().split(" ");
        for(int i=0; i<N; i++){
            first[i]=Integer.parseInt(line[i]);
        }
        //일단 최대값을 추출하고 모든 값에 /최대값*100을 하고 모든 요소 더하기 /N
       int max=first[0];
        for(int i=0; i<N; i++){
            if(first[i]>max){
                max=first[i];
            }
        }//최대값추출
       double sum=0;
        double cal=0;
         for(int i=0; i<N; i++){
             cal=(double)first[i]/max*100;
            sum=sum+cal;
         }// 각각 값에 /최댓값*100하고 모든 요소 더하기
        System.out.println(sum/N);
    }
}