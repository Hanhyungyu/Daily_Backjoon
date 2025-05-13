import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        //이거 2143이 되고 그 다음 배열에 넣어봐야하나?
        String N=br.readLine();
        List<Integer> numbers=new ArrayList<>();
       
        for(int i=0; i<N.length(); i++){
            int num=Integer.parseInt(String.valueOf(N.charAt(i)));
            numbers.add(num);
        }
        Collections.sort(numbers,Collections.reverseOrder());
         for(int i=0; i<N.length(); i++){
             System.out.print(numbers.get(i));
         }                      
        
    }
}