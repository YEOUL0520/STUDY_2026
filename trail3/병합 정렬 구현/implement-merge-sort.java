import java.util.*;

public class Main {
    static int[] temp;
    public static void seperate(int left, int right, int[] arr){
        if(left >= right){
            return;
        }

        int mid = (right+left)/2;

        seperate(left, mid, arr);
        seperate(mid+1, right, arr);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int i = left;
        int j = mid + 1;
        int k = left;

        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= right){
            temp[k++] = arr[j++];
        }

        for(int idx = left; idx <= right; idx++){
            arr[idx] = temp[idx];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int mid = n/2;
        temp = new int[n];

        seperate(0, n-1, arr);

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}