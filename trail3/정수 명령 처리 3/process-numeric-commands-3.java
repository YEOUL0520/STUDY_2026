import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i<n; i++){
            String input = sc.next();
            if(input.equals("push_back")){
                int num = sc.nextInt();
                q.addLast(num);
            }else if(input.equals("push_front")){
                int num = sc.nextInt();
                q.addFirst(num);
            }else if(input.equals("pop_front")){
                System.out.println(q.pollFirst());
            }else if(input.equals("pop_back")){
                System.out.println(q.pollLast());
            }else if(input.equals("size")){
                System.out.println(q.size());
            }else if(input.equals("empty")){
                System.out.println(q.isEmpty() ? 1 : 0);
            }else if(input.equals("front")){
                System.out.println(q.peek());
            }else if(input.equals("back")){
                System.out.println(q.peekLast());
            }
        }
    }
}