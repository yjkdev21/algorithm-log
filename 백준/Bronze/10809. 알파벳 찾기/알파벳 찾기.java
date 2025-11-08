import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] abcs = new int[26];
        for (int i = 0; i < 26; i++) abcs[i] = -1;
        
        for(int i = 0; i < s.length(); i++){

            int a = (int)'a';
            int idx = (int)s.charAt(i) - a;

            if (abcs[idx] == -1){
                abcs[idx] = i;
            }

        }
        for (int abc : abcs) {
            System.out.print(abc+" ");
        }
        br.close();
    }
}