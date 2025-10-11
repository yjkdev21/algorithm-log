import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // 바구니 총 N개
        int n = sc.nextInt();
        int[] basket = new int[n];
        for(int i=0; i<n; i++){
            basket[i] = i+1;
        }
        int m = sc.nextInt();
        
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int temp = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = temp;
        }
        for(int i=0; i<n; i++){
            if (i > 0) System.out.print(" ");
            System.out.print(basket[i]);
        }
        
        sc.close();
    }
}