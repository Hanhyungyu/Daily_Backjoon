import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //입력은 28줄로 학생에 출석번호가 하나씩 주어진다.(30크기 배열 선언하고)
        //일단 1부터 30까지 안낸 학생의 출석번호 가장작은 거랑 그다음 번호 출력
      
        boolean []check=new boolean[30];
        
        for(int i=0; i<28; i++){
            int x=Integer.parseInt(br.readLine());
            check[x-1]=true;
        }
        //입력한 학생은 28이니까 28개의 입력하는 동시에 해당 배열을 false에서 true로 넣음
        
        for(int i=0; i<30; i++){
            if(!check[i]){
                System.out.println(i+1);
            }
        }
     
        
    }
}