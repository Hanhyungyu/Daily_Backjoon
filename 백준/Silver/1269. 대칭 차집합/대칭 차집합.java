import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);

        HashSet<Integer> setA = new HashSet<>();
         String []lineA=br.readLine().split(" ");
        for (int i = 0; i < A; i++) {
            
          setA.add(Integer.parseInt(lineA[i]));
        }

        HashSet<Integer> setB = new HashSet<>();
         String []lineB=br.readLine().split(" ");
        for (int i = 0; i < B; i++) {
         
            int num = Integer.parseInt(lineB[i]);
            if (setA.contains(num)) {
                setA.remove(num);
            } else {
                setB.add(num); 
            }
        }

   
        System.out.println(setA.size() + setB.size());
    }
}
