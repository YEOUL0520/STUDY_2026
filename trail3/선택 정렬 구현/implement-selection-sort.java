import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int k = 0; k < n; k++){

            int min = k;

            for(int i = k + 1; i < n; i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }

            int temp = arr[min];
            arr[min] = arr[k];
            arr[k] = temp;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}