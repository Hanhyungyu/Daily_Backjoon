import java.util.Scanner;
public class Main {

    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[]numbers=new int[N];

        for(int i=0; i<N; i++) {
            numbers[i] = scan.nextInt();
        }

        int S=scan.nextInt();
        int count=0;

        for(int i=0; i<N; i++){
         if(S==numbers[i]){
             count++;
         }
        }
System.out.println(count);
scan.close();
    }
}