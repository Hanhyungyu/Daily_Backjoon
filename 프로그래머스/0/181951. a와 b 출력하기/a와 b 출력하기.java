import java.util.Scanner;
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []Line=br.readLine().split(" ");
        int a=Integer.parseInt(Line[0]);
        int b=Integer.parseInt(Line[1]);

        System.out.println("a"+" "+"="+" "+a);
        System.out.println("b"+" "+"="+" "+b);
    }
}