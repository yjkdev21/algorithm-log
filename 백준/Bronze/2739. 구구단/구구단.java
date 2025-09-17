import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", a,i,a*i);
        }
        br.close();
    }
}