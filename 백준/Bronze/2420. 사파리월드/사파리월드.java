import java.util.Scanner;

public class Main {
    public static void main(String[]args){
       Scanner scan=new Scanner(System.in);
       long x=scan.nextLong();
       long y=scan.nextLong();
       if(x>y){
           System.out.println(x-y);
       }else{
           System.out.println(-(x-y));
       }


    }
}