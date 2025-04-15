// 1을 걸기 위해 2초 1보다 큰경우 +1초씩 추가
// UNUCIC는 868242
// WA는 92-> 10+3 ->13초
// ABC -3초 DEF-4초 GHI-5초 JKL-6초 MNO-7초 PqRS-8초 TUV-9초 WXYZ-10초
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
      int time=0;
       for(int i=0; i<a.length(); i++){
           char ch=a.charAt(i);
           
           if(ch>='A'&& ch<='C'){
               time=time+3;
           }else if(ch>='D' && ch<='F'){
               time=time+4;
           }else if(ch>='G'&& ch<='I'){
               time=time+5;
           }else if(ch >='J'&& ch<='L'){
               time=time+6;
           }else if(ch >='M'&& ch<='O'){
               time=time+7;
           }else if(ch >='P'&& ch <='S'){
               time= time+8;
           }else if(ch >='T'&& ch <='V'){
               time=time+9;
           }else if(ch >='W'&& ch <='Z'){
               time=time+10;
           }
       }
        System.out.println(time);
    }
}