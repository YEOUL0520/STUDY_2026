import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i<n; i++){
            String input = sc.next();
        
            if(input.equals("push")){
                int num = Integer.parseInt(sc.next());
                q.offer(num);
            }else if(input.equals("pop")){
                System.out.println(q.poll());
            }else if(input.equals("size")){
                System.out.println(q.size());
            }else if(input.equals("empty")){
                if(q.isEmpty()){ 
                    System.out.println("1"); 
                }else {
                    System.out.println("0");
                }
            }else if(input.equals("front")){
                System.out.println(q.peek());
            }
        }
    }
}