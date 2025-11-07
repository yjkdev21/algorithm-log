import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());
        
        String[] arr = str.split("");
        
        System.out.print(arr[i-1]);
        
        br.close();
    }
}