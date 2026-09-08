import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int k = 0; k<n; k++){
            int min = 101;
            int min_idx = 0;

            for(int i = k; i<n; i++){
                if(arr[i]< min){
                    min = arr[i];
                    min_idx = i;
                }
            }

            int temp = arr[k];
            arr[k] = arr[min_idx];
            arr[min_idx] = temp;
        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}