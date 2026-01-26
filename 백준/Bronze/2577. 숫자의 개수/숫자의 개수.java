import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        
        String[] arr = String.valueOf(A * B * C).split("");
        int result;
        for(int i = 0; i < 10; i++){
            result = 0;
            for(int j = 0; j < arr.length; j++){
                if (Integer.parseInt(arr[j]) == i) {
                    result++;
                }
            }
            System.out.println(result);
        }
        
        br.close();
    }
}