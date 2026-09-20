import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            String input = sc.next();
            if(input.equals("add")){
                int key = sc.nextInt();
                int value = sc.nextInt();
                map.put(key, value);
            }else if(input.equals("find")){
                int key = sc.nextInt();
                System.out.println(map.containsKey(key) ? map.get(key) : "None");
            }else if(input.equals("remove")){
                int key = sc.nextInt();
                map.remove(key);
            }
        }
    }
}