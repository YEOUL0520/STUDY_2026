import java.util.*;

public class Main {
    public static void main (String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[][] = new int[count][count];
        arr[0][0] = 1;
        for (int n = 1; n<count; n++){
            arr[n][0] = 1;
            arr[n][n] = 1;
            for (int i = 1; i<n; i++) {
                arr[n][i] = arr[n - 1][i - 1] + arr[n - 1][i];
            }
        }

        for (int n = count-1; n>=0; n--){
            for (int m = 0; m<=n; m++){
                System.out.print(arr[n][m] + " ");
            }
            System.out.print("\n");
        }
    }
}
