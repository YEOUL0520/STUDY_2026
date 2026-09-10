import java.util.Scanner;

public class Main {

    public static void heapify(int[] arr, int n, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // 왼쪽 자식이 더 큰 경우
        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 오른쪽 자식이 더 큰 경우
        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // 부모가 가장 큰 값이 아니라면 교환
        if(largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // 교환된 아래쪽에서도 다시 heap 조건 확인
            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr) {

        int n = arr.length;

        // 1. max-heap 만들기
        for(int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2. 최댓값을 뒤로 하나씩 보내기
        for(int i = n - 1; i > 0; i--) {

            // 루트와 마지막 위치 교환
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 뒤로 보낸 값은 제외하고 다시 heapify
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        heapSort(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}