import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("first array 입력");
        int arr[][] = new int[2][3];

        for(int n =0; n<2; n++){
            for (int m = 0; m<3; m++){
                arr[n][m] = sc.nextInt();
            }
        }

        System.out.println("second array 입력");
        int arr2[][] = new int[2][3];

        for(int n =0; n<2; n++){
            for (int m = 0; m<3; m++){
                arr2[n][m] = sc.nextInt();
            }
        }

        int arr3[][] = new int[2][3];

        for(int n =0; n<2; n++){
            for (int m = 0; m<3; m++){
                arr3[n][m] = arr[n][m]*arr2[n][m];
            }
        }

        for(int n =0; n<2; n++){
            for (int m = 0; m<3; m++){
                System.out.print(arr3[n][m]+" ");
            }
            System.out.println();
        }


    }
}
