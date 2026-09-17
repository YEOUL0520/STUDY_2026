import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 1; i<=n; i++){
            q.offer(i);
        }
        while(q.size() != 1){
            q.poll();
            if(q.size() == 1){
                break;
            }
            q.offer(q.poll());
        }
        System.out.print(q.peek());
    }
}