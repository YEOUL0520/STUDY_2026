import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][2];

        for (int n = 0; n<4; n++){
            for (int m = 0; m<2; m++){
                arr[n][m] = sc.nextInt();
            }
        }
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        int avg = 0;
        for (int n = 0; n<4; n++){
            for (int m = 0; m<2; m++){
                sum += arr[n][m];
            }
            avg = sum/2;
            sum = 0;
            System.out.print(avg+" ");
        }
        System.out.print("\n");
        for (int m = 0; m<2; m++){
            for (int n = 0; n<4; n++){
                sum2 += arr[n][m];
            }
            avg = sum2/4;
            sum3 += sum2;
            sum2 = 0;
            System.out.print(avg+" ");
        }
        System.out.print("\n");
        avg = sum3/8;
        System.out.print(avg+" ");
    }
}
