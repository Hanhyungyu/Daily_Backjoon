import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //첫째 줄에 N의 진짜 약수의 개수 N은 50보다 작음
        //둘째 줄에는 N의 진짜 약수
        // 8의 약수는 1,2,4,8로 4개인데 1,과 N은 아니여야하니까 2개이고 약수는 2,4 
        //중복된 경우는 에는 한번만 쓴다.
        //일단 특정 수의 제곱 4,9,16이런것들은 N의 수가 1
      //약수들을 순차정렬했을때 마지막꺼랑 첫번째 거랑 곱하면 N이 나온다.
        int N=Integer.parseInt(br.readLine());
        String []str=br.readLine().split(" ");
        List<Integer> line=new ArrayList<>();
        for(int i=0; i<str.length; i++){
            line.add(Integer.parseInt(str[i]));
        }
        Collections.sort(line);
        
        int result=line.get(0)*line.get(line.size()-1);
        System.out.println(result);
        
        
    }
}