import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Test case
        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];
        String[] newStr = new String[t];
        
        for(int i = 0; i < t; i++){
            arr[i] = br.readLine();
            
            char start = arr[i].charAt(0);
            char end = arr[i].charAt(arr[i].length()-1);
            newStr[i] = String.valueOf(start)+end;
            
            System.out.println(newStr[i]);
        }
        
        
        br.close();
    }
}