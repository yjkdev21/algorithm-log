import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        
        int A = Integer.parseInt(new StringBuilder(s[0]).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(s[1]).reverse().toString());
        
        System.out.print(Math.max(A, B));
        br.close();
    }
}