import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int c = Integer.parseInt(br.readLine());
        
        int ca = c / 60;
        int cb = c % 60;
        
        b += cb;
        
        if (b >= 60) {
            b -= 60;
            a += 1;
        }
        a += ca;
        if (a >= 24) {
            a -= 24;
        }
        
        System.out.printf("%d %d",a,b);
        
        
        br.close();
    }
}