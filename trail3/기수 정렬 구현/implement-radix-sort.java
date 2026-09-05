import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // 가장 큰 값 찾기
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        // 1의 자리, 10의 자리, 100의 자리...
        for (int exp = 1; max / exp > 0; exp *= 10) {

            int[] count = new int[10];
            int[] output = new int[n];

            // 현재 자리 숫자 개수 세기
            for (int i = 0; i < n; i++) {
                int digit = (arr[i] / exp) % 10;
                count[digit]++;
            }

            // 누적합
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // 뒤에서부터 output에 배치
            for (int i = n - 1; i >= 0; i--) {
                int digit = (arr[i] / exp) % 10;

                output[count[digit] - 1] = arr[i];
                count[digit]--;
            }

            // 다시 arr로 복사
            for (int i = 0; i < n; i++) {
                arr[i] = output[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}