import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean[] n = new boolean[42];
        int count = 0;
        
        for(int i = 0; i < 10; i++){
            int mod = sc.nextInt() % 42;
            n[mod] = true;
        }
        
        for(int i = 0; i < 42; i++){
            if(n[i]) count++;
        }
        
        System.out.println(count);
        sc.close();
    }
}