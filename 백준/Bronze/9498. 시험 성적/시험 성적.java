import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        N=N/10;
        if(N>=9){
            System.out.println("A");
        }else if(N>=8){
         System.out.println("B");   
        }else if(N>=7){
        System.out.println("C");
        }else if(N>=6){
        System.out.println("D");}
        else{
            System.out.println("F");
        }
    }
}