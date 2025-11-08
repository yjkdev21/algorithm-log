import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        StringBuilder[] results = new StringBuilder[t];
        StringTokenizer st;
        
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            // 문자열 초기화
            results[i] = new StringBuilder();
            
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    results[i].append(s.charAt(j));
                }
               
            } 
        }

        for (StringBuilder sb : results) {
            System.out.println(sb.toString());
        }
        
        br.close();
    }
}