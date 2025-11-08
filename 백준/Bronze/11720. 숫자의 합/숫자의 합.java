import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.print(sum);
        
        br.close();
    }
}