import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = br.readLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            if (set.contains(br.readLine())) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.newLine();
        bw.flush();
    }
}
