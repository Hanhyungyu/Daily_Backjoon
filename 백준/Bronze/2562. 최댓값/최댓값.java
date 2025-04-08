import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int []number=new int[9];


        for(int i=0; i<9; i++){
        number[i]=Integer.parseInt(br.readLine());
        }

        int max=number[0];
        int index=1;
        for(int z=0;z<9; z++){
            if(number[z]>max){
                max=number[z];
                index=z+1;
            }
        }
        System.out.println(max);
System.out.println(index);



        //이러면 크기가 9인 String []배열 생성

        //숫자 9개를 입력받고 그 중에 최대값을 출력하고 그게 몇번째인지도 출력
        //9개의 숫자를 배열에 넣고 생성하고 그 다음 max선언하고 다 비교하고 해당하는 i와
        //값 출력하기
    }
}
