import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        char ch = n.charAt(0);
        System.out.print((int)ch);
        br.close();
    }
}