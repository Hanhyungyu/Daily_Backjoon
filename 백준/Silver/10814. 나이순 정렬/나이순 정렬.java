import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            list.add(new String[] {input[0], input[1]});
        }

        Collections.sort(list, new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {
                return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            }
        });

        for (int i = 0; i < list.size(); i++) {
            String[] s = list.get(i);
            System.out.println(s[0] + " " + s[1]);
        }
    }
}
