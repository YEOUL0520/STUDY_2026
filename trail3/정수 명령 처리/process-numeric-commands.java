import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Deque<Integer> s = new ArrayDeque<>();

        for(int i = 0; i<n; i++){
            String input = sc.next();
            if(input.equals("push")){
                int num = sc.nextInt();
                s.push(num);
            } else if(input.equals("pop")){
                System.out.println(s.pop());
            } else if(input.equals("size")){
                System.out.println(s.size());
            } else if(input.equals("top")){
                System.out.println(s.peek());
            } else if(input.equals("empty")){
                if(s.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
        }
    }
}