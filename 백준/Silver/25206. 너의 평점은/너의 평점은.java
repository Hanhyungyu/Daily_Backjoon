import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //일단 과목명 입력 그 다음 학점 등급
         double sum1=0.0;
        double sum2=0.0;
        double score=0.0;
        for(int i=0;i<20; i++){
              String []line=br.readLine().split(" ");
            double s=Double.parseDouble(line[1]);
             if (line[2].equals("P")) {
        continue; // P 등급은 계산 제외
               }
            
            
            if(line[2].equals("A+")){
                score=4.5;
                score=score*s;
            }else if(line[2].equals("A0")){
                score=4.0;
                score=score*s;
            }else if(line[2].equals("B+")){
                score=3.5;
                score=score*s;
            }else if(line[2].equals("B0")){
                score=3.0;
                score=score*s;
            }else if(line[2].equals("C+")){
                score=2.5;
                score=score*s;
            }else if(line[2].equals("C0")){
                score=2.0;
                score=score*s;
            }else if(line[2].equals("D+")){
                score=1.5;
                score=score*s;
            }else if(line[2].equals("D0")){
                score=1.0;
                score=score*s;
            }else if(line[2].equals("F")){
                score=0.0;
            }
            sum1=sum1+s;
            sum2=sum2+score;
          
        }
       System.out.printf("%.6f\n", sum2 / sum1);
       
        // 지금 전공과목 과목평점 내 등급(학점)
        // (과목평점x학점) /(학점의 총합)
        // 등급이 P는 계산에서 제외
        // 등급->학점 변환 후에 
        
       

        
        
        
    }
}