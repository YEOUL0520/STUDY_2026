import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        Deque<Character> s = new ArrayDeque<>();
        for(char c : str.toCharArray()){
            if(c == '('){
                s.push(c);
            }else{
                if(!s.isEmpty() && s.peek() == '('){
                    s.pop();
                }else{
                    System.out.println("No");
                    return;
                }
            }
        }

        if(s.isEmpty()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}