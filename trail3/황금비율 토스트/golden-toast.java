import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();

        LinkedList<Character> list = new LinkedList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> iter = list.listIterator(list.size());

        for (int i = 0; i < m; i++) {

            char command = sc.next().charAt(0);

            if (command == 'L') {
                if (iter.hasPrevious()) {
                    iter.previous();
                }

            } else if (command == 'R') {
                if (iter.hasNext()) {
                    iter.next();
                }

            } else if (command == 'D') {
                if (iter.hasNext()) {
                    iter.next();
                    iter.remove();
                }

            } else if (command == 'P') {
                char c = sc.next().charAt(0);
                iter.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : list) {
            sb.append(c);
        }

        System.out.println(sb);
    }
}