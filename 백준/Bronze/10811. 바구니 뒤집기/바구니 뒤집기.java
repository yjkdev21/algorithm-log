import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // 바구니 개수
        int n = sc.nextInt();
        // 바꿀 횟수
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int a = 0; a <n; a++){
            arr[a] = a + 1;
        }
        // 정렬
        for(int a = 0; a < m; a++){
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            
            while(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for (int a = 0; a < n; a++) {
            System.out.print(arr[a] + " ");
        }
        
        
        sc.close();
    }
}