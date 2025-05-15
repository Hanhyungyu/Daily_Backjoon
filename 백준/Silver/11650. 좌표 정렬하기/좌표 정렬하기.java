import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] graph = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            graph[i][0] = Integer.parseInt(line[0]);
            graph[i][1] = Integer.parseInt(line[1]);
        }

        Arrays.sort(graph, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                } else {
                    return a[0] - b[0];
                }
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(graph[i][0] + " " + graph[i][1]);
        }
    }
}
