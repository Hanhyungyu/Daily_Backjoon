import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        
       if(90<=x &&x<=100){
           System.out.println("A");
       }else if(80<=x && x<90){
           System.out.println("B");
       }else if(70<=x && x<80){
           System.out.println("C");
       }else if(60<=x && x<70){
           System.out.println("D");
       }else{
           System.out.println("F");
       }


    }
}
