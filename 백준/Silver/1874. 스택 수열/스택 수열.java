import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int current = 1;
        boolean isPossible = true;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int target = seq[i];
            
            while (current <= target) {
                stack.push(current++);
                sb.append("+\n");
            }
            
            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}
