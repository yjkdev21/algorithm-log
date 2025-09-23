import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int a, b, sum = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum += a * b;
        }
        if (x == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        br.close();
    }
}