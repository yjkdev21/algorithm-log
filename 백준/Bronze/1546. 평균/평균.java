import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int m = 0;
        int[] scores = new int[n];        
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++){
            scores[i] = Integer.parseInt(st.nextToken());
            
            if (scores[i] > m){
                m = scores[i];
            }
        }
        double sum = 0;
        for(int i = 0; i<n; i++) {
            sum += (double) scores[i] / m * 100;
        }
        double avg = sum / n;
        System.out.print(avg);
        
        
        br.close();
    }
}