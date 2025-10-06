import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[9];
        int index = 0, max = 0;
        
        for (int i = 0; i < 9; i++){
            a[i] = sc.nextInt();
            if (max < a[i]){
                max = a[i];
                index = i+1;
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(index);
    }
}