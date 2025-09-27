import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] x = new int[n];
        int min, max;
        x[0] = sc.nextInt();
        min = x[0];
        max = x[0];
        for(int i=1;i<n;i++){
            x[i] = sc.nextInt();
            if (x[i] < min){
                min = x[i];
            }
            if (x[i] > max){
                max = x[i];
            }
        }
        System.out.print(min+" "+max);
        
        sc.close();
    }
}