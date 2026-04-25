import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][2];
        int rowSum[] = new int[4];
        int colSum[] = new int[2];
        int allSum = 0;

        for (int n = 0; n<4; n++){
            for (int m = 0; m<2; m++){
                arr[n][m] = sc.nextInt();

                rowSum[n] += arr[n][m];
                colSum[m] += arr[n][m];
                allSum += arr[n][m];
            }
        }



        for (int n = 0; n<4; n++){
            System.out.print(rowSum[n]/2+" ");
        }
        System.out.print("\n");
        for (int m = 0; m<2; m++){
            System.out.print(colSum[m]/4+" ");
        }
        System.out.print("\n");
        System.out.print(allSum/8+" ");

    }
}
