import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        // Please write your code here.

        for(int i = 0; i<n; i++){
            String command = sc.next();
            
            if (command.equals("push_back")){
                int num = sc.nextInt();
                v.add(num);
            }
            else if (command.equals("get")){
                int num = sc.nextInt();
                System.out.println(v.get(num-1));
            }
            else if (command.equals("size")) {
                System.out.println(v.size());
            }
            else if (command.equals("pop_back")){
                v.remove(v.size()-1);
            }
        }
    }
}