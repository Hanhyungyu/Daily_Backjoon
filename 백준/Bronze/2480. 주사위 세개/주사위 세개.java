import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String [] eyes=br.readLine().split(" ");
        int a=Integer.parseInt(eyes[0]);
        int b=Integer.parseInt(eyes[1]);
        int c=Integer.parseInt(eyes[2]);
        //a=b=c인경우
        //a=b이거나 b=c 거나 a=c이거나
        //a=b일때는 !(b=c)
        //b=c일때는 !(a=c)
        //a=c일때는 !(a-)
        //a,b,c셋다 다른 경우
        
        if(a==b && b==c){
            System.out.println(10000+a*1000);
        }
        
        if(a==b&&!(b==c)){
            System.out.println(1000+a*100);
        }
        if(a==c&&!(a==b)){
            System.out.println(1000+a*100);
        }
        if(b==c&&!(a==c)){
            System.out.println(1000+b*100);
        }
        
        if(!(a==b)&&!(b==c)){
            if(!(a==c)){
          if(a>b && a>c){
              System.out.println(a*100);
          }else if(b>a&&b>c){
              System.out.println(b*100);
          }else if(c>a&&c>b){
              System.out.println(c*100);
          }
            }
        }
        
    }
}