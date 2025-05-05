import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            String[] log = br.readLine().split(" ");
            String name = log[0];
            String action = log[1];

            if (action.equals("enter")) {
                set.add(name);
            } else if (action.equals("leave")) {
                set.remove(name);
            }
        }

        for (String name : set) {
            bw.write(name + "\n");
        }
        bw.flush();
    }
}
