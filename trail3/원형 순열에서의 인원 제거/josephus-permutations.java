import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // Please write your code here.

        Queue<Integer> q = new ArrayDeque<>();
        int delete = 0;

        for(int i = 1; i<= n; i++){
            q.offer(i);
        }
        while(q.size() != 1){
            for(int i = 1; i<k; i++){
                q.offer(q.poll());
            }
            delete = q.poll();
            System.out.print(delete+" ");
        }
        System.out.print(q.poll());
        
    }
}