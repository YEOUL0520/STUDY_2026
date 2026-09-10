import java.util.Scanner;

public class Main {

    public static void quickSort(int[] arr, int left, int right) {

        if(left >= right) {
            return;
        }

        int pivotIdx = partition(arr, left, right);

        // pivot 기준 왼쪽
        quickSort(arr, left, pivotIdx - 1);

        // pivot 기준 오른쪽
        quickSort(arr, pivotIdx + 1, right);
    }

    public static int partition(int[] arr, int left, int right) {

        int pivot = arr[right];

        int i = left - 1;

        for(int j = left; j < right; j++) {

            if(arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // pivot을 자기 자리에 놓기
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}