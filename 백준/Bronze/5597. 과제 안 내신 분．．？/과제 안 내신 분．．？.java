import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean[] n = new boolean[30];
        
        for(int i = 0; i<28; i++) {
            int a = sc.nextInt();
            n[a-1] = true;
        }
        for(int i = 0; i<30; i++) {
            if (!n[i]) {
                System.out.println(i+1);
            }
        }
        
    }
}