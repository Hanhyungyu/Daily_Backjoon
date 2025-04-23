import java.util.Stack;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine()); 
        Stack<Integer> line = new Stack<>();

        for (int i = 0; i < K; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (!line.isEmpty()) {
                    line.pop();
                }
            } else {
                line.push(x);
            }
        }

        int sum = 0;
       for(int i=0; i<line.size();i++){
           sum=sum+line.get(i);
       }

        System.out.println(sum);
    }
}
