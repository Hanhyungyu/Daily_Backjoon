import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        // 1번 파일이름 검색이니까 다 소문자로만 + 모든 입력받는 파일이름의 길이는 같음 1개는 그냥 출력
        // 입력받은 모든 파일을 비교했을때 같은 문자가 하나도 없다->?만
        int N=Integer.parseInt(br.readLine());
     String []line=new String[N];
        for(int i=0; i<N; i++){
            line[i]=br.readLine();
        }
        String compare="";
        int length=line[0].length();
        for(int i=0; i<length; i++){
            char ch=line[0].charAt(i);
            boolean same=true;
            
            for(int j=1; j<N; j++){
                if(line[j].charAt(i)!=ch){
                 same=false;
                    break;
                }
            }
            if(same){
                compare=compare+ch;
                
            }else{
                compare=compare+"?";
            }
        }
        System.out.println(compare);
    }
}