import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Set<String> set=new HashSet<>();
        
        for(int i=0; i<N; i++){
            String s=br.readLine();
            set.add(s);
        }
        List<String> list=new ArrayList<>(set);
        
          Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                } else {
                    return s1.compareTo(s2);
                }
            }
        });
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        
    }
}